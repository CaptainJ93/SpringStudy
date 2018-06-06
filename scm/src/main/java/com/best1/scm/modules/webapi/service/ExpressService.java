package com.best1.scm.modules.webapi.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best1.scm.common.utils.IdGen;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitDetailService;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitPathdetailService;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.webapi.client.ExpressClient;
import com.best1.scm.modules.webapi.dao.ExpressDao;
import com.best1.scm.modules.webapi.entity.ExpressCarrierInfo;
import com.best1.scm.modules.webapi.mapper.AliExpress;
import com.best1.scm.modules.webapi.mapper.Data;
import com.best1.scm.modules.webapi.mapper.ShowapiResBody;

/**
 * 快递公司API业务
 * 
 * @author jiashizhen
 *
 */
@Service
public class ExpressService {

	@Autowired
	ExpressDao expressDao;
	@Autowired
	ExpressClient expressClient;
	@Autowired
	DeliveryOrderintransitDetailService deliveryOrderintransitDetailService;
	@Autowired
	DeliveryOrderintransitService deliveryOrderintransitService;
	@Autowired
	DeliveryOrderintransitPathdetailService deliveryOrderintransitPathDetailService;

	private Integer successCode = 0;// 查询成功状态

	/**
	 * 查询出需要拉取快递信息的订单的订单号和快递公司
	 */
	public List<ExpressCarrierInfo> findToFetchExpressNo(ExpressCarrierInfo expressCarrierInfo) {
		return expressDao.findListToFetchExpress(expressCarrierInfo);
	}

	/**
	 * 更新快递状态
	 */
	public void updateTrackingStatus(ExpressCarrierInfo expressCarrierInfo) {
		expressDao.updateTrackingStatus(expressCarrierInfo);
	}

	/**
	 * 删除以前的快递路途信息
	 */
	public void deletePathDetails(ExpressCarrierInfo expressCarrierInfo) {
		expressDao.deletePathDetails(expressCarrierInfo);
	}

	/**
	 * 插入新的快递路径信息
	 */
	public void insertPathDetails(ExpressCarrierInfo expressCarrierInfo) {
		expressDao.insertPathDetails(expressCarrierInfo);
	}

	/*
	 * 
	 */
	public void handleData() {
		// 取出要查的订单号
		ExpressCarrierInfo expressCarrierInfo = new ExpressCarrierInfo();
		// 设置发货方式查询条件
		expressCarrierInfo.setDeliveryType(1002);
		expressCarrierInfo.setDeliverySubtype(1001);

		// 设置记录生成时间 距离现在时间小于15天
		expressCarrierInfo.setRecordcreatedtimeStart(getStartDate());

		List<ExpressCarrierInfo> deliveryOrderintransitList = findToFetchExpressNo(expressCarrierInfo);

		for (ExpressCarrierInfo d : deliveryOrderintransitList) {
			Integer days = daysBetween(d.getRecordcreatedtime(), new Date());
			if (days <= 15 && days > 7) {
				// 距今15天以内7天以上的还在途中的订单改为已签收不再查
				updateStatus(d.getTrackingnumber(), 4, new Date());
			} else {
				// 其余的调接口
				String expressCompanyNo = d.getApicode();
				String trackingNumber = d.getTrackingnumber();
				try {
					if("no".equals(expressCompanyNo)){
						continue;
					}
					AliExpress express = expressClient.requestAPIAliExpress(expressCompanyNo, trackingNumber);
					if (successCode == express.getShowapi_res_code()) {

						// 查询成功
						// 删除以前的快递路径信息
						deletePathDetail(trackingNumber);

						ShowapiResBody showapi_res_body = new ShowapiResBody();
						// 获取具体快递信息
						showapi_res_body = express.getShowapi_res_body();

						if (showapi_res_body.getStatus() == 4 || showapi_res_body.getStatus() == 5) {
							// 签收和拒收 更新快递状态
							updateStatus(showapi_res_body.getMailNo(), showapi_res_body.getStatus(),
									showapi_res_body.getData().get(0).getTime());
						}
						// 更新快递信息到数据库
						List<Data> dataList = showapi_res_body.getData();
						insertPathDetail(dataList, showapi_res_body.getStatus(), trackingNumber);
					}
				} catch (Exception e) {
					System.out.print("异常快递单:"+trackingNumber+"错误:"+e);
					continue;
				}
			}
		}
	}


	/**
	 * 获取两个时间间隔几天
	 * 
	 * @param smdate
	 * @param bdate
	 * @return
	 */
	public static int daysBetween(Date smdate, Date bdate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 获取15天前日期
	 * 
	 * @return
	 */
	public Date getStartDate() {
		// System.out.println(DateUtils.addDays(new Date(), -15));
		return DateUtils.addDays(new Date(), -15);
	}

	/**
	 * 
	 * @param trackingNumber
	 *            快递单号
	 * @param status
	 *            快递状态
	 */
	public void updateStatus(String trackingNumber, Integer status, Date time) {
		ExpressCarrierInfo expressCarrierInfo = new ExpressCarrierInfo();

		Integer scmTrackingStatus;
		if (status == 4) {
			scmTrackingStatus = 1002;
		} else {
			scmTrackingStatus = 1003;
		}

		expressCarrierInfo.setLastupdatedtime(new Date());
		expressCarrierInfo.setTrackingstatus(scmTrackingStatus);
		expressCarrierInfo.setReceiptorrejecttime(getFinancialDate(time));
		expressCarrierInfo.setTrackingnumber(trackingNumber);

		updateTrackingStatus(expressCarrierInfo);
	}

	// /**
	// * 设置时间
	// */
	// public Date checkRecieveTime(Date time){
	// //获取今天日期
	// Calendar c = Calendar.getInstance();
	// Date dt=new Date();
	// //当前时间是26号0点之前
	// if(dt.getTime() < getLastMonthTime(0,26,0).getTime()){
	// //签收时间不在在上个月26日到本月25日
	// if(!(time.getTime() <= getLastMonthTime(-1,26,0).getTime() &&
	// time.getTime() >= getLastMonthTime(0,25,1).getTime())){
	// c.add(Calendar.DAY_OF_MONTH, 26);
	// return getLastMonthTime(-1,26,0);
	// }else{
	// return time;
	// }
	// }else{
	// //签收时间在26号0点之后的
	// if(!(time.getTime() <= getLastMonthTime(0,26,0).getTime())){
	// return getLastMonthTime(0,26,0);
	// }else{
	// return time;
	// }
	//
	// }
	// }

	// /**
	// * 获取时间
	// * @param num
	// * @param day
	// * @param flag
	// * @return
	// */
	// public Date getLastMonthTime(Integer num,Integer day,Integer flag){
	// Calendar cld = Calendar.getInstance();
	// cld.set(Calendar.MONTH,cld.get(Calendar.MONTH)+num);
	// cld.set(Calendar.DATE,day);
	// if(flag == 1){
	// cld.set(Calendar.HOUR,23);
	// cld.set(Calendar.MINUTE,59);
	// cld.set(Calendar.SECOND,59);
	// }else{
	// cld.set(Calendar.HOUR,0);
	// cld.set(Calendar.MINUTE,0);
	// cld.set(Calendar.SECOND,0);
	// }
	// return cld.getTime();
	// }

	public static Date getFinancialDate(Date originalDate) {
		// 当前时间
		Calendar nowCalendar = Calendar.getInstance();

		// 获取当月26号0点Calendar
		Calendar c1 = Calendar.getInstance();
		c1.set(nowCalendar.get(Calendar.YEAR), nowCalendar.get(Calendar.MONTH), 26, 0, 0, 0);

		if (nowCalendar.before(c1)) {
			// 获取上月26号0点Calendar
			Calendar lastMonthCalendar = Calendar.getInstance();
			lastMonthCalendar.add(Calendar.MONTH, -1);
			lastMonthCalendar.set(lastMonthCalendar.get(Calendar.YEAR), lastMonthCalendar.get(Calendar.MONTH), 26, 0, 0,
					0);
			// 如果如果传来的时间在上个月26号0点之前则是26号0 否则为传来的时间
			if (originalDate.before(lastMonthCalendar.getTime())) {
				return lastMonthCalendar.getTime();
			} else {
				return originalDate;
			}
		} else {
			// 如果传来的时间在26号0点之前 则为26号0点 否则为传来的时间
			if (originalDate.before(c1.getTime())) {
				return c1.getTime();
			} else {
				return originalDate;
			}
		}
	}

	/**
	 * 向数据库写入快递路径信息
	 */
	public void insertPathDetail(List<Data> datas, Integer status, String trackingnumber) {
		// 写入新的快递路径信息
		ExpressCarrierInfo expressCarrierInfo = new ExpressCarrierInfo();
		if ((null != datas) && (datas.size() > 0)) {
			for (int i = 0; i < datas.size(); i++) {
				expressCarrierInfo.setId(IdGen.uuid());
				if (status == 4 && i == 0) {
					// 已签收
					expressCarrierInfo.setPathdesc(datas.get(i).getContext());
					expressCarrierInfo.setPathdatetime(datas.get(i).getTime());
					expressCarrierInfo.setDeliverycode(1002);
					expressCarrierInfo.setReceiptorrejecttime(datas.get(i).getTime());
					String receiptperson = datas.get(i).getContext();
					if ((null != receiptperson) && (receiptperson.length() > 10)) {
						expressCarrierInfo.setReceiptperson(receiptperson.substring(0, 10));
					} else {
						expressCarrierInfo.setReceiptperson(receiptperson);
					}

					expressCarrierInfo.setRecordcreatedtime(new Date());
					expressCarrierInfo.setRecordcreatedby(6);
					expressCarrierInfo.setTrackingnumber(trackingnumber);
				} else if (status == 5 && i == 0) {
					// 已拒收
					expressCarrierInfo.setPathdesc(datas.get(i).getContext());
					expressCarrierInfo.setPathdatetime(datas.get(i).getTime());
					expressCarrierInfo.setDeliverycode(1003);
					expressCarrierInfo.setReceiptorrejecttime(datas.get(i).getTime());
					expressCarrierInfo.setReceiptperson(null);
					expressCarrierInfo.setRecordcreatedtime(new Date());
					expressCarrierInfo.setRecordcreatedby(6);
					expressCarrierInfo.setTrackingnumber(trackingnumber);
				} else {
					expressCarrierInfo.setPathdesc(datas.get(i).getContext());
					expressCarrierInfo.setPathdatetime(datas.get(i).getTime());
					expressCarrierInfo.setDeliverycode(1001);
					expressCarrierInfo.setReceiptorrejecttime(null);
					expressCarrierInfo.setReceiptperson(null);
					expressCarrierInfo.setRecordcreatedtime(new Date());
					expressCarrierInfo.setRecordcreatedby(6);
					expressCarrierInfo.setTrackingnumber(trackingnumber);
				}
				insertPathDetails(expressCarrierInfo);
			}
		}
	}

	/**
	 * 
	 * @param trackingNumber
	 *            快递单号
	 */
	public void deletePathDetail(String trackingNumber) {
		ExpressCarrierInfo expressCarrierInfo = new ExpressCarrierInfo();
		expressCarrierInfo.setTrackingnumber(trackingNumber);
		deletePathDetails(expressCarrierInfo);
	}
}

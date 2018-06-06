/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitPathdetail;
import com.best1.scm.modules.delivery.dao.DeliveryOrderintransitPathdetailDao;

/**
 * 订单包裹配送在途路由信息表Service
 * @author hwh
 * @version 2016-03-02
 */
@Service
@Transactional(readOnly = true)
public class DeliveryOrderintransitPathdetailService extends CrudService<DeliveryOrderintransitPathdetailDao, DeliveryOrderintransitPathdetail> {
	
	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService ;

	public DeliveryOrderintransitPathdetail get(String id) {
		return super.get(id);
	}
	
	public List<DeliveryOrderintransitPathdetail> findList(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail) {
		return super.findList(deliveryOrderintransitPathdetail);
	}
	
	public Page<DeliveryOrderintransitPathdetail> findPage(Page<DeliveryOrderintransitPathdetail> page, DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail) {
		return super.findPage(page, deliveryOrderintransitPathdetail);
	}
	
	@Transactional(readOnly = false)
	public void save(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail) {
		super.save(deliveryOrderintransitPathdetail);
	}
	
	/**
	 * 存储路由信息时对包裹进行状态进行验证，如果不是配送中，更新包裹头状态
	 * @param deliveryOrderintransitPathdetail
	 */
	@Transactional(readOnly = false)
	public void saveAll(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail) {
		
		super.save(deliveryOrderintransitPathdetail);
		
		if((1001==(deliveryOrderintransitPathdetail.getDeliverycode()))||(1000==(deliveryOrderintransitPathdetail.getDeliverycode()))){
			
		}else{
			
			DeliveryOrderintransit deliveryOrderintransit = new DeliveryOrderintransit();
			deliveryOrderintransit.setTrackingnumber(deliveryOrderintransitPathdetail.getTrackingnumber());
			List<DeliveryOrderintransit> deliveryOrderintransitList= deliveryOrderintransitService.findList(deliveryOrderintransit);
			if(null!=deliveryOrderintransitList&&(deliveryOrderintransitList.size()>0)){
				deliveryOrderintransit = deliveryOrderintransitList.get(0);
				deliveryOrderintransit.setTrackingstatus(deliveryOrderintransitPathdetail.getDeliverycode());
				if(null!=deliveryOrderintransitPathdetail.getReceiptorrejecttime()){
					deliveryOrderintransit.setReceiptorrejecttime(getFinancialDate(deliveryOrderintransitPathdetail.getReceiptorrejecttime()));
				}else{
					deliveryOrderintransit.setReceiptorrejecttime(getFinancialDate(new Date()));
				}
				deliveryOrderintransitService.update(deliveryOrderintransit);  //更新包裹配送状态
			}
		}
	}
	
	@Transactional(readOnly = false)
	public void delete(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail) {
		super.delete(deliveryOrderintransitPathdetail);
	}
	
	
	/**
	 * 返回签收/拒收时间 对应的财务月结时间
	 * @param originalDate
	 * @return
	 */
	public static Date getFinancialDate(Date originalDate){
		//当前时间
		Calendar nowCalendar = Calendar.getInstance();
		
		//获取当月26号0点Calendar
		Calendar c1 = Calendar.getInstance();
		c1.set(nowCalendar.get(Calendar.YEAR), nowCalendar.get(Calendar.MONTH), 26, 0, 0, 0);

		if(nowCalendar.before(c1)){
			//获取上月26号0点Calendar
			Calendar lastMonthCalendar = Calendar.getInstance();
			lastMonthCalendar.add(Calendar.MONTH, -1);
			lastMonthCalendar.set(lastMonthCalendar.get(Calendar.YEAR), lastMonthCalendar.get(Calendar.MONTH), 26, 0, 0, 0);
			//如果如果传来的时间在上个月26号0点之前则是26号0 否则为传来的时间
			if(originalDate.before(lastMonthCalendar.getTime())){
				return lastMonthCalendar.getTime();
			}else{
				return originalDate;
			}
		}else{
			//如果传来的时间在26号0点之前 则为26号0点  否则为传来的时间
			if(originalDate.before(c1.getTime())){
				return c1.getTime();
			}else{
				return originalDate;
			}
			
		}
		
	}
	
}
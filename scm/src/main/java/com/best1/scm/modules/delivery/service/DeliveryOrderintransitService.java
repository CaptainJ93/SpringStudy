/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.delivery.dao.DeliveryOrderintransitDao;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitDetail;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitPathdetail;
import com.best1.scm.modules.vws.entity.Carrierzipcode;
import com.best1.scm.modules.vws.service.CarrierzipcodeService;

/**
 * 配送包裹Service
 * 
 * @author hwh
 * @version 2016-03-02
 */
@Service
@Transactional(readOnly = true)
public class DeliveryOrderintransitService extends
		CrudService<DeliveryOrderintransitDao, DeliveryOrderintransit> {
	private static final Logger  logger =  LoggerFactory.getLogger(DeliveryOrderintransitService.class);
	
	@Autowired
	private DeliveryOrderintransitDetailService deliveryOrderintransitDetailService;

	@Autowired
	private DeliveryOrderintransitPathdetailService deliveryOrderintransitPathdetailService;

	@Autowired
	private CarrierzipcodeService carrierzipcodeService;
	
	
	public DeliveryOrderintransit deliveryDetail(String id) {
		DeliveryOrderintransit deliveryOrderintransit = super.get(id);
		if (deliveryOrderintransit != null
				&& StringUtils.isNotBlank(deliveryOrderintransit
						.getTrackingnumber())) {

			DeliveryOrderintransitDetail deliveryOrderintransitDetail = new DeliveryOrderintransitDetail();
			deliveryOrderintransitDetail
					.setTrackingnumber(deliveryOrderintransit
							.getTrackingnumber());
			List<DeliveryOrderintransitDetail> deliveryOrderintransitDetaillist = deliveryOrderintransitDetailService
					.findList(deliveryOrderintransitDetail);
			deliveryOrderintransit
					.setDeliveryOrderintransitDetail(deliveryOrderintransitDetaillist);
			DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail = new DeliveryOrderintransitPathdetail();
			deliveryOrderintransitPathdetail
					.setTrackingnumber(deliveryOrderintransit
							.getTrackingnumber());
			List<DeliveryOrderintransitPathdetail> deliveryOrderintransitPathdetaillist = deliveryOrderintransitPathdetailService
					.findList(deliveryOrderintransitPathdetail);
			deliveryOrderintransit.setDeliveryOrderintransitPathdetail(deliveryOrderintransitPathdetaillist);

		}
		
		if (deliveryOrderintransit != null
				&& StringUtils.isNotBlank(deliveryOrderintransit
					.getSelectedcarrier())&& StringUtils.isNotBlank(deliveryOrderintransit
							.getReceivingzipcode())) {

			Carrierzipcode carrierzipcode=new Carrierzipcode();
			carrierzipcode.setCarrierid(Long.parseLong(deliveryOrderintransit
					.getSelectedcarrier()));
			carrierzipcode.setZipcode(deliveryOrderintransit.getReceivingzipcode());
			
			List<Carrierzipcode> carrierzipcodelist =carrierzipcodeService.findList(carrierzipcode);
			if(carrierzipcodelist!=null&&carrierzipcodelist.size()>0){
				deliveryOrderintransit.setCarrierzipcode(carrierzipcodelist.get(0));
			
			}

		}

		return deliveryOrderintransit;
	}

	public DeliveryOrderintransit get(String id) {
		return super.get(id);
	}

	public List<DeliveryOrderintransit> findList(
			DeliveryOrderintransit deliveryOrderintransit) {
		return super.findList(deliveryOrderintransit);
	}
	
	/**
	 * 查询出包裹明细并且带有包裹中订单明细
	 * @param deliveryOrderintransit
	 * @return
	 */
	public List<DeliveryOrderintransit> findListWithPackageDetail(
			DeliveryOrderintransit deliveryOrderintransit) {
		List<DeliveryOrderintransit> deliveryOrderintransitList = super.findList(deliveryOrderintransit);
		DeliveryOrderintransitDetail deliveryOrderintransitDetail = new DeliveryOrderintransitDetail();
		for(DeliveryOrderintransit d : deliveryOrderintransitList){  //遍历包裹信息
			deliveryOrderintransitDetail.setTrackingnumber(d.getTrackingnumber());
			List<DeliveryOrderintransitDetail>  deliveryOrderintransitDetailList = this.deliveryOrderintransitDetailService.findList(deliveryOrderintransitDetail);
			if(null != deliveryOrderintransitDetailList){
				d.setDeliveryOrderintransitDetail(deliveryOrderintransitDetailList); //赋予包裹对应的订单商品明细信息
			}
		}
		
		return deliveryOrderintransitList;
	}

	public Page<DeliveryOrderintransit> findPage(
			Page<DeliveryOrderintransit> page,
			DeliveryOrderintransit deliveryOrderintransit) {
		return super.findPage(page, deliveryOrderintransit);
	}

	@Transactional(readOnly = false)
	public void save(DeliveryOrderintransit deliveryOrderintransit) {
		//判断是否存在
		DeliveryOrderintransit deliveryOrderintransittemp = new DeliveryOrderintransit();
		deliveryOrderintransittemp.setTrackingnumber(deliveryOrderintransit.getTrackingnumber());
		List<DeliveryOrderintransit> deliveryOrderintransitList = this.findList(deliveryOrderintransittemp);
		if((null!=deliveryOrderintransitList)&&(deliveryOrderintransitList.size()>0)){
			logger.info(deliveryOrderintransit.getTrackingnumber()+"is exists...");
		}else{
			super.save(deliveryOrderintransit);
		}
		
	}
	@Transactional(readOnly = false)
	public void update(DeliveryOrderintransit deliveryOrderintransit) {
	     deliveryOrderintransit.setIsNewRecord(false);
		 super.save(deliveryOrderintransit);
	}
	
	

	@Transactional(readOnly = false)
	public void delete(DeliveryOrderintransit deliveryOrderintransit) {
		super.delete(deliveryOrderintransit);
	}

}
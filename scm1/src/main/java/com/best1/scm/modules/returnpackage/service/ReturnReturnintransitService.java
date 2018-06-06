package com.best1.scm.modules.returnpackage.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.irpeort.entity.ReturnPackage;
import com.best1.scm.modules.irpeort.entity.ReturnPackageDetail;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitDetail;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitPathdetail;
import com.best1.scm.modules.returnpackage.dao.ReturnReturnintransitDao;
import com.best1.scm.modules.vws.entity.Carrierdeliverorderid;
import com.best1.scm.modules.vws.entity.Carrierzipcode;
import com.best1.scm.modules.vws.service.CarrierdeliverorderidService;
import com.best1.scm.modules.vws.service.CarrierzipcodeService;
import com.best1.scm.common.utils.DateUtils;

/**
 * 退换货信息Service
 * 
 * @author hwh
 * @version 2016-03-15
 */
@Service
@Transactional(readOnly = true)
public class ReturnReturnintransitService extends
		CrudService<ReturnReturnintransitDao, ReturnReturnintransit> {
	
	private static final Logger  logger =  LoggerFactory.getLogger(ReturnReturnintransitService.class);
	@Autowired
	private ReturnReturnintransitDetailService returnReturnintransitDetailService;
	@Autowired
	private ReturnReturnintransitPathdetailService returnReturnintransitPathdetailService;
	@Autowired
	private CarrierzipcodeService carrierzipcodeService;
	
	@Autowired
	private CarrierdeliverorderidService carrierdeliverorderidService;

	public ReturnReturnintransit get(String id) {
		return super.get(id);
	}

	public ReturnReturnintransit returnOrderDetail(String id) {
		ReturnReturnintransit returnReturnintransit = super.get(id);

		if (returnReturnintransit != null
				&& returnReturnintransit.getReturnid() > 0) {

			ReturnReturnintransitDetail returnReturnintransitDetail = new ReturnReturnintransitDetail();
			returnReturnintransitDetail.setReturnid(returnReturnintransit
					.getReturnid());

			List<ReturnReturnintransitDetail> returnReturnintransitDetaillist = returnReturnintransitDetailService
					.findList(returnReturnintransitDetail);
			returnReturnintransit
					.setReturnReturnintransitDetail(returnReturnintransitDetaillist);

			ReturnReturnintransitPathdetail returnReturnintransitPathdetail = new ReturnReturnintransitPathdetail();
			returnReturnintransitPathdetail.setReturnid(returnReturnintransit
					.getReturnid());

			List<ReturnReturnintransitPathdetail> returnReturnintransitPathdetaillist = returnReturnintransitPathdetailService
					.findList(returnReturnintransitPathdetail);
			returnReturnintransit
					.setReturnReturnintransitPathdetail(returnReturnintransitPathdetaillist);

		}

		if (returnReturnintransit != null
				&& returnReturnintransit
						.getSelectedcarrier()!=null
				&& StringUtils.isNotBlank(returnReturnintransit.getZipcode())) {

			Carrierzipcode carrierzipcode = new Carrierzipcode();
			carrierzipcode.setCarrierid(returnReturnintransit
					.getSelectedcarrier());
			carrierzipcode.setZipcode(returnReturnintransit.getZipcode());

			List<Carrierzipcode> carrierzipcodelist = carrierzipcodeService
					.findList(carrierzipcode);
			if (carrierzipcodelist != null && carrierzipcodelist.size() > 0) {
				returnReturnintransit.setCarrierzipcode(carrierzipcodelist
						.get(0));

			}

		}
		return returnReturnintransit;
	}

	public List<ReturnReturnintransit> findList(
			ReturnReturnintransit returnReturnintransit) {
		return super.findList(returnReturnintransit);
	}

	@Transactional(readOnly = false)
	public int buildDeliveryorderid(ReturnReturnintransit returnReturnintransit) {
		int index=0;
		//receiptstatus
		returnReturnintransit.setReceiptstatus(SCMConstants.Receipt_Status_ongoing);
		List<ReturnReturnintransit> returnlist = super
				.findList(returnReturnintransit);
		if(returnlist==null||returnlist.size()==0)
		{
			return SCMConstants.No_Data; 
		}
		Carrierdeliverorderid carrierdeliverorderid=new Carrierdeliverorderid();
		carrierdeliverorderid.setCarrierid(returnReturnintransit.getSelectedcarrier());
		carrierdeliverorderid.setStatus(SCMConstants.Deliveryorderid_Status_UnUse);
		List<Carrierdeliverorderid> deliverorderidlist=carrierdeliverorderidService.findList(carrierdeliverorderid);
		if(deliverorderidlist==null||deliverorderidlist.size()==0||deliverorderidlist.size()<returnlist.size()){
			//面单号不足
			return SCMConstants.Deliveryorderid_Status_Shortage;
		}
		for(ReturnReturnintransit obj:returnlist){
			Carrierdeliverorderid deliverorder=deliverorderidlist.get(index);
			obj.setReceiptdeliveryorderid(deliverorder.getDeliveryorderid());
			obj.setReceiptstatus(SCMConstants.Receipt_Status_build);//生成面单
			obj.setLastupdatedby(returnReturnintransit.getLastupdatedby());
			obj.setLastupdatedtime(DateUtils.getTodayTime());
			this.save(obj);
			deliverorder.setStatus(SCMConstants.Deliveryorderid_Status_Used);//已使用
			carrierdeliverorderidService.save(deliverorder);
			index++;
		}
	return SCMConstants.Success;	
		
	}


	/**
	 * 查询处理的退货列表附带明细
	 * @param returnReturnintransit
	 * @return
	 */
	public List<ReturnReturnintransit>  findListWithDetail(
			ReturnReturnintransit returnReturnintransit) {
		
		List<ReturnReturnintransit>    returnReturnintransitList = super.findList(returnReturnintransit);  //获取退货头信息
		ReturnReturnintransitDetail returnReturnintransitDetail = new ReturnReturnintransitDetail();
		if(null!=returnReturnintransitList){  
			for(ReturnReturnintransit r : returnReturnintransitList){ //遍历头信息，赋予明细信息
				
				returnReturnintransitDetail.setReturnid(r.getReturnid());
				List<ReturnReturnintransitDetail> returnReturnintransitDetailList = this.returnReturnintransitDetailService.findList(returnReturnintransitDetail);
				if(null!=returnReturnintransitDetailList){
					r.setReturnReturnintransitDetail(returnReturnintransitDetailList);
				}
			}
			
			
		}
		return returnReturnintransitList;
	}
	
	
	@Transactional(readOnly = false)
	public List<ReturnPackage> findListWithDetailLable(
			ReturnReturnintransit returnReturnintransit) {
		List<ReturnPackage> returnPackageList=new ArrayList<ReturnPackage>();
		
		List<ReturnReturnintransit>    returnReturnintransitList = super.findList(returnReturnintransit);  //获取退货头信息
		ReturnReturnintransitDetail returnReturnintransitDetail = new ReturnReturnintransitDetail();
		if(null!=returnReturnintransitList){  
			for(ReturnReturnintransit r : returnReturnintransitList){ //遍历头信息，赋予明细信息
				ReturnPackage returnPackage=new ReturnPackage();
				returnPackage.setReturnid(r.getReturnid());
				returnPackage.setCustomername(r.getCustomername());
				returnPackage.setMobilenumber(r.getMobilenumber());
				returnPackage.setTelephonenumber(r.getTelephonenumber());
				returnPackage.setReceiveaddress(r.getReceiveaddress1()+r.getReceiveaddress2());
				returnPackage.setRefundcodnumber(r.getRefundcodnumber());
				returnPackage.setIsneedinvoice(r.getIsfacetofacerefund());
				returnPackage.setReturntype(r.getReturntype());
				returnPackage.setReceiptdeliveryorderid(r.getReceiptdeliveryorderid());
				returnPackageList.add(returnPackage);
				returnReturnintransitDetail.setReturnid(r.getReturnid());
				r.setReceiptstatus(SCMConstants.Receipt_Status_Print);
				r.setLastupdatedby(returnReturnintransit.getLastupdatedby());
				r.setLastupdatedtime(DateUtils.getTodayTime());
				super.save(r);
				List<ReturnReturnintransitDetail> returnReturnintransitDetailList = this.returnReturnintransitDetailService.findList(returnReturnintransitDetail);
				List<ReturnPackageDetail>returnPackageDetailList=new ArrayList<ReturnPackageDetail>();
				if(null!=returnReturnintransitDetailList){
					
					for(ReturnReturnintransitDetail obj :returnReturnintransitDetailList){
						ReturnPackageDetail returnPackageDetail=new ReturnPackageDetail();
						returnPackageDetail.setProductid(obj.getProductid());
						returnPackageDetail.setProductname(obj.getProductname());
						returnPackageDetail.setColorvalue(obj.getColorvalue());
						returnPackageDetail.setStylevalue(obj.getStylevalue());
						returnPackageDetail.setProductboxingdetail(obj.getProductboxingdetail());
						returnPackageDetail.setProductdetail(obj.getProductboxingdetail());
						returnPackageDetailList.add(returnPackageDetail);
					}
					returnPackage.setReturnPackageDetail(returnPackageDetailList);
				}
			}
			
			
		}
		return returnPackageList;
	}
	

	public Page<ReturnReturnintransit> findPage(
			Page<ReturnReturnintransit> page,
			ReturnReturnintransit returnReturnintransit) {
		return super.findPage(page, returnReturnintransit);
	}

	@Transactional(readOnly = false)
	public void save(ReturnReturnintransit returnReturnintransit) {
		//判断是否有重复
		ReturnReturnintransit returnReturnintransitTemp = new ReturnReturnintransit();
		returnReturnintransitTemp.setReturnid(returnReturnintransit.getReturnid());
		List<ReturnReturnintransit> returnReturnintransitList = this.findList(returnReturnintransitTemp);
		if((null!=returnReturnintransitList)&&(returnReturnintransitList.size()>0)){
			logger.info(returnReturnintransit.getReturnid()+"is exists...");
		}else{
			super.save(returnReturnintransit);
		}
		
	}
	
	@Transactional(readOnly = false)
	public void update(ReturnReturnintransit returnReturnintransit) {
		//判断是否有重复
		returnReturnintransit.setIsNewRecord(false);
		super.save(returnReturnintransit);
	}
	
	
	/**
	 * 更新A换A揽收所使用的快递单号
	 * @param returnReturnintransit
	 */
	@Transactional(readOnly = false)
	public void updateReceiptdeliveryorderid(ReturnReturnintransit returnReturnintransit) {
		
		ReturnReturnintransit returnReturnintransitTemp = new ReturnReturnintransit();
		returnReturnintransitTemp.setReturnid(returnReturnintransit.getReturnid());
		List<ReturnReturnintransit> returnReturnintransitList = this.findList(returnReturnintransitTemp);
		for(ReturnReturnintransit r :returnReturnintransitList){
			r.setReceiptdeliveryorderid(returnReturnintransit.getReceiptdeliveryorderid());
			r.setLastupdatedtime(new Date());
			r.setIsNewRecord(false);
			super.save(r);
		}
		
		
	}
	
	

	@Transactional(readOnly = false)
	public void delete(ReturnReturnintransit returnReturnintransit) {
		super.delete(returnReturnintransit);
	}

}
package com.best1.api.service.oaf.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;






import com.best1.api.entity.oaf.order.CustomerOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafEorderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.mapper.oaf.order.ToafEorderinvoiceinfoMapper;
import com.best1.api.mapper.oaf.order.ToafOrderinvoiceinfoMapper;
import com.best1.api.service.oaf.CustomerOrderManageSerevice;
import com.best1.api.service.oaf.InvoiceManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;

@Component
@Transactional
@Monitored
public class InvoiceManageSereviceImpl implements InvoiceManageSerevice {
	private static Logger logger = LoggerFactory
			.getLogger(InvoiceManageSereviceImpl.class);

	@Autowired
	private ToafOrderinvoiceinfoMapper orderInvoiceDAO;

	@Autowired
	private ToafEorderinvoiceinfoMapper eorderInvoiceDAO;
	
	@Autowired
	private CustomerOrderManageSerevice customerorderManageService;

	@Override
	public List<CustomerOrderinvoiceinfo> orderInvoicePrint(
			CustomerOrderinvoiceinfo orderInvoice) {
		logger.info("发票信息获取");

		List<CustomerOrderinvoiceinfo> orderInvoiceInfoes = orderInvoiceDAO
				.selectCustomerOrderinvoiceinfo(orderInvoice);
		return orderInvoiceInfoes;
	}

	@Override
	public int createEorderinvoice(ToafEorderinvoiceinfo eorderinvoice)
			throws Exception {
		logger.info("电子发票信息保存");
		eorderinvoice.setCreatedtimestamp(DateUtil.getTodayTime());
		eorderinvoice.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		eorderInvoiceDAO.insertSelective(eorderinvoice);
		
		ToafOrderinvoiceinfo orderInvoice = new ToafOrderinvoiceinfo();
		orderInvoice.setInvoiceinfoid(eorderinvoice.getInvoiceinfoid());
		orderInvoice.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		orderInvoice.setLastmodifiedby(eorderinvoice.getLastmodifiedby());
		orderInvoice.setInvoiceno(Long.parseLong(eorderinvoice.getFphm()));
		orderInvoice.setInvoiceissuedate(DateUtil.strToDateLong(eorderinvoice.getKprq()));
       	orderInvoiceDAO.updateByPrimaryKeySelective(orderInvoice);
		return 0;
	}
	
	@Override
	public int eorderinvoiceReturn(CustomerOrderinvoiceinfo orderInvoice) {
		logger.info("发票冲红");
		int returnint=0;
		 try {
	        ToafEorderinvoiceinfo eorderinvoice=new ToafEorderinvoiceinfo();
			eorderinvoice.setEinvoiceinfoid(orderInvoice.getEinvoiceinfoid());
			eorderinvoice.setEinvoiceinfostatus(APIConstant.EINVOICEINFOSTATUS_CONFIRM);
			eorderinvoice.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			eorderinvoice.setLastmodifiedby(orderInvoice.getLastmodifiedby());
			returnint=eorderInvoiceDAO.updateByPrimaryKeySelective(eorderinvoice);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//}
		return returnint;
	}


	@Override
	public int orderInvoiceReturn(
			CustomerOrderinvoiceinfo orderInvoice) {
		logger.info("发票冲红");
		int returnint=0;
		//List<CustomerOrderinvoiceinfo> orderInvoiceInfoes = orderInvoiceDAO.selectCustomerReturninvoiceinfo(orderInvoice);
		//for(CustomerOrderinvoiceinfo obj:orderInvoiceInfoes){
		ToafEorderinvoiceinfo eorderinvoiceor  =eorderInvoiceDAO.selectByPrimaryKey(orderInvoice.getEinvoiceinfoid());
		ToafOrderinvoiceinfo orderinvoice=orderInvoiceDAO.selectByPrimaryKey(eorderinvoiceor.getInvoiceinfoid());
		try {
			orderinvoice.setCreatedby(orderInvoice.getLastmodifiedby());
			
			ToafOrderinvoiceinfo orderinvoicere=customerorderManageService.checkInvoice(orderinvoice);
			
			if(orderinvoicere!=null&&orderinvoicere.getRtncode()==APIConstant.RETURN_OK){
		    logger.info("ERP返回CODE:"+orderinvoicere.getRtncode());
			ToafEorderinvoiceinfo eorderinvoice=new ToafEorderinvoiceinfo();
			//eorderinvoice.setInvoiceinfoid(orderInvoice.getInvoiceinfoid());
			eorderinvoice.setEinvoiceinfoid(orderInvoice.getEinvoiceinfoid());
			eorderinvoice.setEinvoiceinfostatus(APIConstant.EINVOICEINFOSTATUS_CONFIRM);
			eorderinvoice.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			eorderinvoice.setLastmodifiedby(orderInvoice.getLastmodifiedby());
			returnint=eorderInvoiceDAO.updateByPrimaryKeySelective(eorderinvoice);
			}
			else{
				logger.info("ERP返回CODE:"+orderinvoicere.getRtncode());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//}
		return returnint;
	}

	@Override
	public List<CustomerOrderinvoiceinfo> InvoiceReturnConfirm(
			CustomerOrderinvoiceinfo orderInvoice) {
		logger.info("发票冲红确认数据");

		List<CustomerOrderinvoiceinfo> orderInvoiceInfoes =orderInvoiceDAO.selectCustomerReturninvoiceinfo(orderInvoice);
		return orderInvoiceInfoes;
	}



	@Override
	public ToafOrderinvoiceinfo orderInvoiceinfo(
			ToafOrderinvoiceinfo orderinvoiceinfo) {
		// TODO Auto-generated method stub
		return orderInvoiceDAO.selectByPrimaryKey(orderinvoiceinfo.getInvoiceinfoid());
	}

	@Override
	public int orderInvoiceReturnBack(ToafEorderinvoiceinfo eorderinvoice) {
		// TODO Auto-generated method stub
		return eorderInvoiceDAO.updateByPrimaryKeySelective(eorderinvoice);
	}

	@Override
	public List<CustomerOrderinvoiceinfo> orderEInvoiceDownload(
			CustomerOrderinvoiceinfo orderInvoice) {
		logger.info("发票查询");
		List<CustomerOrderinvoiceinfo> orderInvoiceInfoes =orderInvoiceDAO.selectCustomerEinvoiceinfo(orderInvoice);
		return orderInvoiceInfoes;
	}

	
}

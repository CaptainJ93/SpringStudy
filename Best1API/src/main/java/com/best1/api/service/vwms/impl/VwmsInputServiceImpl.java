package com.best1.api.service.vwms.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.entity.vwms.TvwsApiCsowholeConfirm;
import com.best1.api.entity.vwms.TvwsApiCsowholeConfirmExample;
import com.best1.api.entity.vwms.TvwsApiProductinventory;
import com.best1.api.entity.vwms.TvwsApiProductinventoryExample;
import com.best1.api.entity.vwms.TvwsApiProductinventoryExample.Criteria;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirm;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirmExample;
import com.best1.api.entity.vwms.TvwsApiRtvconfirm;
import com.best1.api.entity.vwms.TvwsApiRtvconfirmExample;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirm;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirmExample;
import com.best1.api.entity.vwms.TvwsApiWhtransferodconfirm;
import com.best1.api.service.vwms.VwmsInputService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.vwms.CsowholeConfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.OrderinvoiceinfoDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductinventoryDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnorderconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.RtvconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliershipconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.WhtransferodconfirmDTO;
import com.best1.api.mapper.oaf.order.ToafOrderinvoiceinfoMapper;
import com.best1.api.mapper.vwms.TvwsApiCsowholeConfirmMapper;
import com.best1.api.mapper.vwms.TvwsApiProductinventoryMapper;
import com.best1.api.mapper.vwms.TvwsApiReturnorderconfirmMapper;
import com.best1.api.mapper.vwms.TvwsApiRtvconfirmMapper;
import com.best1.api.mapper.vwms.TvwsApiSuppliershipconfirmMapper;
import com.best1.api.mapper.vwms.TvwsApiWhtransferodconfirmMapper;

@Component
@Transactional
@Monitored
public class VwmsInputServiceImpl implements VwmsInputService {

	@Autowired
	private ToafOrderinvoiceinfoMapper orderinvoiceinfoMapperDAO;
	
	@Autowired
	private TvwsApiCsowholeConfirmMapper csowholeConfirmMapperDAO;

	@Autowired
	private TvwsApiProductinventoryMapper  productinventoryDAO;
	
	@Autowired
	private TvwsApiRtvconfirmMapper  rtvconfirmDAO;

	@Autowired
	private TvwsApiReturnorderconfirmMapper  returnorderconfirmDAO;
	
	
	@Autowired
	private  TvwsApiSuppliershipconfirmMapper  suppliershipconfirmDAO;
	
	@Autowired
	private  TvwsApiWhtransferodconfirmMapper  whtransferodconfirmDAO;
	
	private static Logger logger = LoggerFactory
			.getLogger(VwmsInputServiceImpl.class);

	@Override
	public OrderinvoiceinfoDTO modifyOrderInvoiceno(
			ToafOrderinvoiceinfo orderinvoiceinfo) {
		logger.info("发票号");
		orderinvoiceinfo.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		OrderinvoiceinfoDTO dto = BeanMapper.map(orderinvoiceinfo,
				OrderinvoiceinfoDTO.class);
		if (orderinvoiceinfoMapperDAO
				.updateInvoicenoByOrderSelective(orderinvoiceinfo) > 0) {
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		}
		
		
		return dto;
	}

	@Override
	public CsowholeConfirmDTO modifyShippingConfirmed(
			TvwsApiCsowholeConfirm csoConfirmed) {
		logger.info("出货 确认");
		csoConfirmed.setRecordcreatedtime(DateUtil.getTodayTime());
		csoConfirmed.setRecordstatus(APIConstant.RECORD_STATUS_NEW);
		CsowholeConfirmDTO dto = BeanMapper.map(csoConfirmed,
				CsowholeConfirmDTO.class);
		if(csowholeConfirmMapperDAO.insertSelective(csoConfirmed)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		
		}
		return dto;
	}

	@Override
	public ProductinventoryDTO modifyProductinventory(
			TvwsApiProductinventory productinventory) {
		logger.info("商品库存");
		productinventory.setRecordcreatedtime(DateUtil.getTodayTime());
		productinventory.setRecordstatus(APIConstant.RECORD_STATUS_NEW);
		ProductinventoryDTO dto = BeanMapper.map(productinventory,
				ProductinventoryDTO.class);
		
		//查询是否存在 如果存在则已存在的失效 1002
		TvwsApiProductinventoryExample example = new TvwsApiProductinventoryExample();
		Criteria criterion = example.createCriteria();
		criterion.andProductidEqualTo(dto.getProductid());
		criterion.andColourclassEqualTo(dto.getColourclass());
		criterion.andColourcodeEqualTo(dto.getColourcode());
		criterion.andStyleclassEqualTo(dto.getStyleclass());
		criterion.andStylecodeEqualTo(dto.getStylecode());
		criterion.andLocationidEqualTo(dto.getLocationid());
		criterion.andProductversionEqualTo(dto.getProductversion());
		criterion.andLocationtypeEqualTo(dto.getLocationtype());
		criterion.andRecordstatusEqualTo(APIConstant.RECORD_STATUS_NEW);
		if(productinventoryDAO.countByExample(example)>0){
			TvwsApiProductinventory productinventoryexists = new TvwsApiProductinventory();
			productinventoryexists.setRecordstatus(APIConstant.RECORD_STATUS_invalid);
			productinventoryDAO.updateByExampleSelective(productinventoryexists, example);
		}
		
		if(productinventoryDAO.insertSelective(productinventory)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		
		}
		return dto;
	}
	
	public ProductinventoryDTO modifyProductinventoryByProc(
			TvwsApiProductinventory productinventory) {
		logger.info("商品库存更新By Proc");
		ProductinventoryDTO dto = BeanMapper.map(productinventory,
				ProductinventoryDTO.class);
		productinventoryDAO.updateInventoryProcedure(productinventory);
		dto.setRtncode(APIConstant.RTNCODE_OK);
		return dto;
	}

	@Override
	public RtvconfirmDTO modifyReturnProductconfirm(
			TvwsApiRtvconfirm returnproduct) {
		logger.info("商品退厂");
		returnproduct.setRecordcreatedtime(DateUtil.getTodayTime());
		returnproduct.setRecordstatus(APIConstant.RECORD_STATUS_NEW);
		RtvconfirmDTO dto = BeanMapper.map(returnproduct,
				RtvconfirmDTO.class);
		if(rtvconfirmDAO.insertSelective(returnproduct)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		
		}
		return dto;
	}

	@Override
	public ReturnorderconfirmDTO modifyReturnOrderconfirm(
			TvwsApiReturnorderconfirm returnorder) {
		logger.info("客户销退");
		returnorder.setRecordcreatedtime(DateUtil.getTodayTime());
		returnorder.setRecordstatus(APIConstant.RECORD_STATUS_NEW);
		ReturnorderconfirmDTO dto = BeanMapper.map(returnorder,
				ReturnorderconfirmDTO.class);
		if(returnorderconfirmDAO.insertSelective(returnorder)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		
		}
		return dto;
	}

	@Override
	public SuppliershipconfirmDTO modifySupplierShipconfirm(
			TvwsApiSuppliershipconfirm suppliershiporder) {
		logger.info("厂商送货");
		suppliershiporder.setRecordcreatedtime(DateUtil.getTodayTime());
		suppliershiporder.setRecordstatus(APIConstant.RECORD_STATUS_NEW);
		SuppliershipconfirmDTO dto = BeanMapper.map(suppliershiporder,
				SuppliershipconfirmDTO.class);
		if(suppliershipconfirmDAO.insertSelective(suppliershiporder)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
	
		}
		return dto;
	}

	@Override
	public WhtransferodconfirmDTO modifyWhtransferodconfirm(
			TvwsApiWhtransferodconfirm whtransferodconfirm) {
		logger.info("跨订单");
		whtransferodconfirm.setRecordcreatedtime(DateUtil.getTodayTime());
		whtransferodconfirm.setRecordstatus(APIConstant.RECORD_STATUS_NEW);
		WhtransferodconfirmDTO dto = BeanMapper.map(whtransferodconfirm,
				WhtransferodconfirmDTO.class);
		if(whtransferodconfirmDAO.insertSelective(whtransferodconfirm)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
	
		}
		return dto;
	}

	@Override
	public List<TvwsApiProductinventory> selectByExample(
			TvwsApiProductinventoryExample example) {
		// TODO Auto-generated method stub
		return productinventoryDAO.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TvwsApiProductinventory record,
			TvwsApiProductinventoryExample example) {
		// TODO Auto-generated method stub
		return productinventoryDAO.updateByExampleSelective(record, example);
	}
	
	
	@Override
	public List<TvwsApiSuppliershipconfirm> selectByExample(
			TvwsApiSuppliershipconfirmExample example) {
		// TODO Auto-generated method stub
		return suppliershipconfirmDAO.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TvwsApiSuppliershipconfirm record,
			TvwsApiSuppliershipconfirmExample example) {
		// TODO Auto-generated method stub
		return suppliershipconfirmDAO.updateByExampleSelective(record, example);
	}

	@Override
	public List<TvwsApiCsowholeConfirm> selectByExample(
			TvwsApiCsowholeConfirmExample example) {
		// TODO Auto-generated method stub
		return csowholeConfirmMapperDAO.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TvwsApiCsowholeConfirm record,
			TvwsApiCsowholeConfirmExample example) {
		// TODO Auto-generated method stub
		return csowholeConfirmMapperDAO.updateByExampleSelective(record, example);
	}

	@Override
	public List<TvwsApiReturnorderconfirm> selectByExample(
			TvwsApiReturnorderconfirmExample example) {
		// TODO Auto-generated method stub
		return returnorderconfirmDAO.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TvwsApiReturnorderconfirm record,
			TvwsApiReturnorderconfirmExample example) {
		// TODO Auto-generated method stub
		return returnorderconfirmDAO.updateByExampleSelective(record, example);
	}

	@Override
	public List<TvwsApiRtvconfirm> selectByExample(
			TvwsApiRtvconfirmExample example) {
		// TODO Auto-generated method stub
		return rtvconfirmDAO.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TvwsApiRtvconfirm record,
			TvwsApiRtvconfirmExample example) {
		// TODO Auto-generated method stub
		return rtvconfirmDAO.updateByExampleSelective(record, example);
	}
	
	
}

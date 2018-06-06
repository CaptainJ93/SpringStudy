package com.best1.api.service.oaf.impl;

import java.util.List;
import java.util.ArrayList;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.oaf.order.ToafApiFedirefundrequest;
import com.best1.api.entity.oaf.order.ToafApiFedirefundrequestExample;
import com.best1.api.entity.oaf.order.ToafApiFedirefundresponse;
import com.best1.api.entity.oaf.order.ToafApiFedirefundresponseExample;
import com.best1.api.entity.oaf.order.ToafRefunddetails;
import com.best1.api.entity.oaf.order.ToafRefunddetailsExample;
import com.best1.api.mapper.oaf.order.ToafApiFedirefundrequestMapper;
import com.best1.api.mapper.oaf.order.ToafApiFedirefundresponseMapper;
import com.best1.api.mapper.oaf.order.ToafRefunddetailsMapper;
import com.best1.api.service.oaf.CustomerRefundManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.IOAFDomainConstants;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundrequestDTO;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundresponseDTO;
import com.best1.api.webservice.soap.response.dto.oaf.RefunddetailsDTO;



@Component
@Transactional
@Monitored
public class CustomerRefundManageSereviceImpl implements
		CustomerRefundManageSerevice {
	private static Logger logger = LoggerFactory
			.getLogger(CustomerRefundManageSereviceImpl.class);

	@Autowired
	private ToafApiFedirefundrequestMapper fedirefundrequestDAO;
	@Autowired
	private ToafApiFedirefundresponseMapper fedirefundresponseDAO;
	
	@Autowired
	private ToafRefunddetailsMapper refunddetailsDAO;

	@Override
	public List<FedirefundrequestDTO> queryFedirefundRequest(
			ToafApiFedirefundrequest fedirefundRequest) {
		logger.info("退款信息");
		logger.info(fedirefundRequest.getBatchid());
		logger.info(fedirefundRequest.getBankcode());
		ToafApiFedirefundrequestExample example =new ToafApiFedirefundrequestExample();
		ToafApiFedirefundrequestExample.Criteria criteria=example.createCriteria();
		criteria.andBatchidEqualTo(fedirefundRequest.getBatchid());
		criteria.andBankcodeEqualTo(fedirefundRequest.getBankcode());
		List<ToafApiFedirefundrequest> fedirefundRequests=fedirefundrequestDAO.selectByExample(example);
		List<FedirefundrequestDTO> fedirefundRequestdtoes = BeanMapper.mapList(fedirefundRequests,
				FedirefundrequestDTO.class);
		return fedirefundRequestdtoes;
	}

	@Override
	public FedirefundresponseDTO modifyFedirefundResponse(
			ToafApiFedirefundresponse fedirefundResponse) {
		logger.info("退款信息确认");
		fedirefundResponse.setCreatedtimestamp(DateUtil.getTodayTime());
		fedirefundResponse.setRecordcreatedtime(DateUtil.getTodayTime());
		fedirefundResponse.setRecordstatus(APIConstant.RECORD_STATUS_NEW);
		FedirefundresponseDTO dto = BeanMapper.map(fedirefundResponse,
				FedirefundresponseDTO.class);
		if(fedirefundresponseDAO.insertSelective(fedirefundResponse)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		
		}
		return dto;
	}
	
	
	@Override
	public FedirefundresponseDTO UpdateFedirefundResponse(
			ToafApiFedirefundresponse fedirefundResponse) {
		
		FedirefundresponseDTO dto = BeanMapper.map(fedirefundResponse,
				FedirefundresponseDTO.class);
		
		if(fedirefundresponseDAO.updateByRefundId(fedirefundResponse)>0){
			dto.setRtncode(APIConstant.RTNCODE_OK);
		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return dto;
	}
	
	
	
	
	@Override
	public List<FedirefundresponseDTO> queryFedirefundResponse(
			ToafApiFedirefundresponse toafApiFedirefundresponse) {
		ToafApiFedirefundresponseExample example =new ToafApiFedirefundresponseExample();
		ToafApiFedirefundresponseExample.Criteria criteria=example.createCriteria();
		criteria.andRecordstatusEqualTo(toafApiFedirefundresponse.getRecordstatus());
		List<ToafApiFedirefundresponse> fedirefundRequests=fedirefundresponseDAO.selectByExample(example);
		List<FedirefundresponseDTO> fedirefundResponsedtoes = BeanMapper.mapList(fedirefundRequests,
				FedirefundresponseDTO.class);
		return fedirefundResponsedtoes;
	}

	@Override
	public List<RefunddetailsDTO> queryRefunddetails(RefunddetailsDTO refunddetailsdto) {
		

		ToafRefunddetails refunddetails = BeanMapper.map(refunddetailsdto,
				ToafRefunddetails.class);
		
		ToafRefunddetailsExample example=new ToafRefunddetailsExample();
		ToafRefunddetailsExample.Criteria criteria=example.createCriteria();
		criteria.andOrderidEqualTo(refunddetails.getOrderid());
		criteria.andItemidEqualTo(refunddetails.getItemid());
		criteria.andCustomeridEqualTo(refunddetails.getCustomerid());
		List<Integer> values=new ArrayList<Integer>();
		values.add(IOAFDomainConstants.OAF_REFUND_IN_PROGRESS);
		values.add(IOAFDomainConstants.OAF_REFUND_SUCCESSFUL);
		values.add(IOAFDomainConstants.OAF_REFUND_PROCESS_COMPLETED);
		criteria.andRefundstatusIn(values);
		List<ToafRefunddetails> list=refunddetailsDAO.selectByExample(example);
		List<RefunddetailsDTO> refunddetailses=BeanMapper.mapList(list, RefunddetailsDTO.class);
		return refunddetailses;
	}
}

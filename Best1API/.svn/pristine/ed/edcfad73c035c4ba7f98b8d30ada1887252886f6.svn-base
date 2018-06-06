package com.best1.api.service.view.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.view.ReturnOrderView;
import com.best1.api.mapper.view.ReturnOrderViewMapper;
import com.best1.api.service.view.ReturnOrderViewService;
import com.best1.api.utils.IOAFDomainConstants;

@Component
@Transactional
@Monitored
public class ReturnOrderViewServiceImpl implements ReturnOrderViewService {
	@Autowired
	private ReturnOrderViewMapper returnOrderViewDAO;

	@Override
	public List<ReturnOrderView> fetchReturnOrders(
			ReturnOrderView returnOrderView) {
		List<ReturnOrderView> returnOrders = returnOrderViewDAO
				.fetchReturnOrders(returnOrderView);
		for (ReturnOrderView returnOrder : returnOrders) {
			if (returnOrder.getOrderReturnType() != IOAFDomainConstants.PRODUCT_RETURN_TYPE_RETURN) {
				returnOrder.setOrderAmount(0.0);
			}
		}
		return returnOrders;
	}
}

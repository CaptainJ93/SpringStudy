package com.best1.api.service.view.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.view.OrderPaymentView;
import com.best1.api.mapper.view.OrderPaymentViewMapper;
import com.best1.api.service.view.OrderPaymentViewService;

@Component
@Transactional
@Monitored
public class OrderPaymentViewServiceImpl implements OrderPaymentViewService {
	@Autowired
	private OrderPaymentViewMapper orderPaymentViewDAO;

	@Override
	public List<OrderPaymentView> fetchOrderPayments(
			OrderPaymentView orderPayment) {
		return orderPaymentViewDAO.fetchOrderPayments(orderPayment);
	}

}

package com.best1.api.service.view.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.view.OrderedProductView;
import com.best1.api.mapper.view.OrderedProductViewMapper;
import com.best1.api.service.view.OrderedProductViewService;

@Component
@Transactional
@Monitored
public class OrderedProductViewServiceImpl implements OrderedProductViewService {
	@Autowired
	private OrderedProductViewMapper orderedProductViewDAO;

	@Override
	public List<OrderedProductView> fetchOrderedProducts(
			OrderedProductView orderedProduct) {
		return orderedProductViewDAO.fetchOrderedProducts(orderedProduct);
	}

}

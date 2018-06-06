package com.best1.api.service.view.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.view.SupplierShipOrderView;
import com.best1.api.mapper.view.SupplierShipOrderViewMapper;
import com.best1.api.service.view.SupplierShipOrderViewService;

@Component
@Transactional
@Monitored
public class SupplierShipOrderViewServiceImpl implements
		SupplierShipOrderViewService {
	@Autowired
	private SupplierShipOrderViewMapper supplierShipOrderViewDAO;

	@Override
	public List<SupplierShipOrderView> fetchSupplierShipOrders(
			SupplierShipOrderView supplierShipOrder) {
		return supplierShipOrderViewDAO
				.fetchSupplierShipOrders(supplierShipOrder);
	}

}

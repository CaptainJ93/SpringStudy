package com.best1.api.service.view.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.view.ProductView;
import com.best1.api.entity.view.SupplierView;
import com.best1.api.mapper.view.ProductViewMapper;
import com.best1.api.mapper.view.SupplierViewMapper;
import com.best1.api.service.view.SupplierViewService;
@Component
@Transactional
@Monitored
public class SupplierViewServiceImpl implements SupplierViewService {
	private static Logger logger = LoggerFactory
			.getLogger(SupplierViewServiceImpl.class);
	
	@Autowired
	private SupplierViewMapper supplierViewDao;
	@Autowired
    private ProductViewMapper  productViewDao;
	
	@Override
	public List<SupplierView> fetchSuppliers(SupplierView record) {
		// TODO Auto-generated method stub
		return supplierViewDao.fetchSuppliers(record);
	}

	@Override
	public List<ProductView> fetchProducts(ProductView record) {
		// TODO Auto-generated method stub
		return productViewDao.fetchProducts(record);
	}

}

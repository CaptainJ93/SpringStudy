package com.best1.api.mapper.view;

import java.util.List;

import com.best1.api.entity.view.OrderedProductView;
import com.best1.api.mapper.SqlMapper;

@SqlMapper
public interface OrderedProductViewMapper {

	List<OrderedProductView> fetchOrderedProducts(OrderedProductView record);
}
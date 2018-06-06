package com.best1.api.service.view;

import java.util.List;

import com.best1.api.entity.view.OrderedProductView;

public interface OrderedProductViewService {
	List<OrderedProductView> fetchOrderedProducts(
			OrderedProductView orderedProduct);
}

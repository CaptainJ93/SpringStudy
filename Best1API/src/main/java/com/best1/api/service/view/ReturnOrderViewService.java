package com.best1.api.service.view;

import java.util.List;

import com.best1.api.entity.view.ReturnOrderView;

public interface ReturnOrderViewService {
	List<ReturnOrderView> fetchReturnOrders(ReturnOrderView returnOrderView);
}

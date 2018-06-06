package com.best1.api.mapper.view;

import java.util.List;

import com.best1.api.entity.view.ReturnOrderView;
import com.best1.api.mapper.SqlMapper;

@SqlMapper
public interface ReturnOrderViewMapper {
	List<ReturnOrderView> fetchReturnOrders(ReturnOrderView record);
}

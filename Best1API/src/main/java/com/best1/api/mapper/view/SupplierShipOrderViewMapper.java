package com.best1.api.mapper.view;

import java.util.List;

import com.best1.api.entity.view.SupplierShipOrderView;
import com.best1.api.mapper.SqlMapper;

@SqlMapper
public interface SupplierShipOrderViewMapper {
	List<SupplierShipOrderView> fetchSupplierShipOrders(
			SupplierShipOrderView record);
}

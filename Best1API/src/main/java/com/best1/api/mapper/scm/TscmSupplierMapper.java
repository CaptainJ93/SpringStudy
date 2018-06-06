package com.best1.api.mapper.scm;

import java.util.List;

import com.best1.api.entity.scm.product.TscmProductsclass;
import com.best1.api.entity.scm.spm.TcmnSpmuser;
import com.best1.api.entity.scm.supplier.TscmSupplierpendaddress;
import com.best1.api.entity.scm.supplier.TscmSupplierpendaddressExample;
import com.best1.api.entity.scm.supplier.TscmSupplierpendbusiness;
import com.best1.api.entity.scm.supplier.TscmSupplierpending;
import com.best1.api.entity.scm.supplier.TscmSupplierpendingExample;
import com.best1.api.mapper.SqlMapper;

/**
 *  


 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 *
 */
@SqlMapper
public interface TscmSupplierMapper {
	public Long selectSupplierId();
	public int supplierPendingImport(TscmSupplierpending record);
	public int supplierAddressImport(TscmSupplierpendaddress record);
	public int supplierPendBusinessImport(TscmSupplierpendbusiness record);
	public int supplierUserImport(TcmnSpmuser record);
	public int supplierPrdSclassImport(TscmProductsclass record);
	
	public int getRowCount(String supplierRegNo);
	
	public Integer supplierAddressSequenceMax(TscmSupplierpendaddressExample example);

	public List<TscmSupplierpending> selectSupplierpendingByExample(TscmSupplierpendingExample example);
}

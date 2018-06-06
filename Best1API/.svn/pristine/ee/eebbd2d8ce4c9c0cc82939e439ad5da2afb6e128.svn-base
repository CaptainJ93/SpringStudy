package com.best1.api.service.scm;

import java.util.List;

import com.best1.api.entity.scm.product.TscmProductsclass;
import com.best1.api.entity.scm.spm.TcmnSpmuser;
import com.best1.api.entity.scm.supplier.TscmSupplieraddress;
import com.best1.api.entity.scm.supplier.TscmSupplieraddressExample;
import com.best1.api.entity.scm.supplier.TscmSupplieraddressKey;
import com.best1.api.entity.scm.supplier.TscmSupplierbusiness;
import com.best1.api.entity.scm.supplier.TscmSupplierbusinessExample;
import com.best1.api.entity.scm.supplier.TscmSupplierbusinessKey;
import com.best1.api.entity.scm.supplier.TscmSuppliercontract;
import com.best1.api.entity.scm.supplier.TscmSuppliercontractExample;
import com.best1.api.entity.scm.supplier.TscmSuppliercontractpending;
import com.best1.api.entity.scm.supplier.TscmSuppliercontractpendingExample;
import com.best1.api.entity.scm.supplier.TscmSuppliercontractpendingKey;
import com.best1.api.entity.scm.supplier.TscmSupplierdelivery;
import com.best1.api.entity.scm.supplier.TscmSupplierdeliveryExample;
import com.best1.api.entity.scm.supplier.TscmSupplierdeliverypending;
import com.best1.api.entity.scm.supplier.TscmSupplierdeliverypendingExample;
import com.best1.api.entity.scm.supplier.TscmSuppliermaster;
import com.best1.api.entity.scm.supplier.TscmSuppliermasterExample;
import com.best1.api.entity.scm.supplier.TscmSupplierpendaddress;
import com.best1.api.entity.scm.supplier.TscmSupplierpendbusiness;
import com.best1.api.entity.scm.supplier.TscmSupplierpending;

public interface SupplierManageService {
	
	//增加厂商信息
	public TscmSupplierpending addSupplierInfo(TscmSupplierpending tscmSupplierpending, TcmnSpmuser spmUser);
	
	//增加厂商地址信息
	public TscmSupplierpendaddress addSupplierAddressInfo(TscmSupplierpendaddress supplierAddress);
	
	//增加厂商类别
	public TscmSupplierpendbusiness addSupplierBussiness(TscmSupplierpendbusiness supplierBusiness);
	
	//增加厂商用户
	public TcmnSpmuser addSpmSupplierUser(TcmnSpmuser spmUser);
	
	//增加商品分类
	public TscmProductsclass addTscmProductsClass(TscmProductsclass productsClass);
	
	public List<TscmSuppliermaster> selectTscmSuppliermasterByExample(TscmSuppliermasterExample example);
	
	public TscmSuppliermaster selectTscmSuppliermasterByKey(Long supplierid);
	
	public List<TscmSupplierdeliverypending> selectTscmSupplierdeliverypendingByExample(TscmSupplierdeliverypendingExample example);
	
	public List<TscmSupplierdelivery> selectTscmSupplierdeliveryByExample(TscmSupplierdeliveryExample example);
	
	public List<TscmSuppliercontractpending> selectTscmSuppliercontractpendingByExample(TscmSuppliercontractpendingExample example);
	
	public TscmSuppliercontractpending selectTscmSuppliercontractpendingByKey(TscmSuppliercontractpendingKey key);
	
	public List<TscmSuppliercontract> selectTscmSuppliercontractByExample(TscmSuppliercontractExample example);
	
	public TscmSuppliercontract selectTscmSuppliercontractByKey(Long contractno);
	
	public List<TscmSupplierbusiness> selectTscmSupplierbusinessByExample(TscmSupplierbusinessExample example);
	
	public TscmSupplierbusiness selectTscmSupplierbusinessByKey(TscmSupplierbusinessKey key);
	
	public List<TscmSupplieraddress> selectTscmSupplieraddressByExample(TscmSupplieraddressExample example);
	
	public TscmSupplieraddress selectTscmSupplieraddressByKey(TscmSupplieraddressKey key);
	
}

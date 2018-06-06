package com.best1.api.mapper.scm;

import java.util.Map;
import java.util.List;

import com.best1.api.entity.scm.product.TscmProduct;
import com.best1.api.entity.scm.product.TscmProductattribute;
import com.best1.api.entity.scm.product.TscmProductattributeExample;
import com.best1.api.entity.scm.product.TscmProductcolourstyle;
import com.best1.api.entity.scm.product.TscmProductcolourstyleExample;
import com.best1.api.entity.scm.product.TscmProductgeneral;
import com.best1.api.entity.scm.product.TscmProductgeneralExample;
import com.best1.api.entity.scm.product.TscmProductlogistic;
import com.best1.api.entity.scm.product.TscmProductwarehouse;
import com.best1.api.mapper.SqlMapper;

/**
 *  
 * This method corresponds to the database table Toaf_Orderedproduct


 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 *
 */
@SqlMapper
public interface TscmProductMapper {
	
	void selectByProdInfo(Map<String,Object> param);
	
	Long porductAvailQty(Map<String,Object> param);
	List<TscmProduct>selectInfoByProduct(TscmProduct record);
	List<TscmProductcolourstyle>selectProductColourStyleByProduct(TscmProductcolourstyle record);
	
	List<TscmProductgeneral>selectProductGeneralProduct(TscmProductgeneral record);
	List<TscmProductlogistic>selectProductLogisticProduct(TscmProductlogistic record);
	List<TscmProductwarehouse>selectProductWarehouseProduct(TscmProductwarehouse record);
	//COLOR_SEARCH
	void selectPorductColor(Map<String,Object> param);
	//STYLE
	void selectPorductStyle(Map<String,Object> param);
	
	void selectStockProd(Map<String,Object> param);
	
	int updateProductByPrimaryKeySelective(TscmProduct record);
	
	int insertProductcolourstyleSelective(TscmProductcolourstyle record);
	int updateProductcolourstyleByPrimaryKeySelective(TscmProductcolourstyle record);
	int updateProductcolourstyleByExample(TscmProductcolourstyle record);
	
	int insertProductGeneralSelective(TscmProductgeneral record);
	
	public Integer productGeneralSequenceMax(TscmProductgeneralExample example);

	public List<TscmProduct>selectSpmProductidByProduct(Long spmproductid);
	
	public List<TscmProductattribute> selectProductattributeByExample(TscmProductattributeExample example);
	public List<TscmProductcolourstyle> selectProductcolourstyleByExample(TscmProductcolourstyleExample example);

}

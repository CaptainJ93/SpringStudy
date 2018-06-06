package com.best1.api.mapper.scm;

import java.util.List;

import com.best1.api.entity.scm.product.TspmProductattribute;
import com.best1.api.entity.scm.product.TscmProductimage;
import com.best1.api.entity.scm.product.TspmProductwarehouse;
import com.best1.api.entity.scm.spm.TscmSpmscmproduct;
import com.best1.api.entity.scm.spm.TscmSpmscmproductExample;
import com.best1.api.entity.scm.spm.TspmProduct;
import com.best1.api.entity.scm.spm.TspmProductExample;
import com.best1.api.entity.scm.spm.TspmProductattributeExample;
import com.best1.api.entity.scm.spm.TspmProductcolourstyle;
import com.best1.api.entity.scm.spm.TspmProductcolourstyleExample;
import com.best1.api.entity.scm.spm.TspmProductgeneral;
import com.best1.api.entity.scm.spm.TspmProductgeneralExample;
import com.best1.api.entity.scm.spm.TspmProductwarehouseExample;
import com.best1.api.mapper.SqlMapper;

/**
 * 
 * 
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * 
 */
@SqlMapper
public interface TspmProductMapper {

	public int createspmProduct(TspmProduct record);

	public int spmProductColourStyleImport(TspmProductcolourstyle record);

	public int spmProductGeneralImport(TspmProductgeneral record);

	public int spmProductImageImport(TscmProductimage record);
	
    public int spmProductWarehouseImport(TspmProductwarehouse record);
    
    public int spmProductattributeImport(TspmProductattribute record);

	
	public Integer spmProductGeneralSequenceMax(TspmProductgeneralExample example);
	
    public TspmProduct selectSpmProductByPrimaryKey(Long productid);
    public List<TspmProductattribute> selectProductattributeByExample(TspmProductattributeExample example);
    public List<TspmProductcolourstyle> selectProductcolourstyleByExample(TspmProductcolourstyleExample example);

    public List<TspmProductwarehouse> selectProductwarehouseByExample(TspmProductwarehouseExample example);

    public List<TspmProduct> selectSpmProductByExample(TspmProductExample example);
    
    public  List<TscmSpmscmproduct> selectSpmscmproductByExample(TscmSpmscmproductExample example);

}

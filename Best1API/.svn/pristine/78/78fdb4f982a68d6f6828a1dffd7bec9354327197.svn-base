package com.best1.api.service.scm;

import com.best1.api.entity.scm.product.TscmProductimage;
import com.best1.api.entity.scm.product.TspmProductattribute;
import com.best1.api.entity.scm.product.TspmProductwarehouse;
import com.best1.api.entity.scm.spm.TscmSpmscmproduct;
import com.best1.api.entity.scm.spm.TspmProduct;
import com.best1.api.entity.scm.spm.TspmProductcolourstyle;
import com.best1.api.entity.scm.spm.TspmProductgeneral;

public interface SpmProductManageSerevice {
	
	/**
	 * 获取TscmSpmscmproduct信息
	 */
	public TscmSpmscmproduct selectTscmSpmscmproduct(Long spmProductId);
	
	/** 商品信息导入 **/
	public TspmProduct spmProductImport(TspmProduct spmproduct);

	/** 商品信颜色款式入 **/
	public TspmProductcolourstyle spmPrdcolourstyleImport(
			TspmProductcolourstyle spmprdcolourstyle);

	/** 商品信息导入 **/
	public TspmProductgeneral spmPrdgeneralImport(
			TspmProductgeneral spmprdgeneral);

	/** 商品图片信息导入 **/
	public TscmProductimage spmPrdimageImport(TscmProductimage spmprodimage);

	/**
	 * 商品仓库导入
	 * 
	 * @param spmprodwarehouse
	 * @return
	 */
	public TspmProductwarehouse spmPrdwarehouseImport(
			TspmProductwarehouse spmprodwarehouse);

	/**
	 * 商品属性导入
	 * 
	 * @param spmproductattribute
	 * @return
	 */
	public TspmProductattribute spmPrdattributeImport(
			TspmProductattribute spmproductattribute);
	
	/**
	 * 根据spm商品代码查询scm商品代码
	 */
	public TscmSpmscmproduct tscmSpmscmproduct(TscmSpmscmproduct tscmSpmscmproduct);
}

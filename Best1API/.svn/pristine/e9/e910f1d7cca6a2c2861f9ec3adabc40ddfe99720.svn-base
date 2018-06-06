package com.best1.api.service.scm;

import java.util.List;

import com.best1.api.entity.scm.product.ProductInfo;
import com.best1.api.entity.scm.product.TscmProduct;
import com.best1.api.entity.scm.product.TscmProductcolourstyle;
import com.best1.api.entity.scm.product.TscmProductgeneral;
import com.best1.api.entity.scm.product.TscmProductlogistic;
import com.best1.api.entity.scm.product.TscmProductwarehouse;


public interface ProductManageSerevice {

	/**
	 * 商品信息
	 * **/
	public List<ProductInfo>selectProductInfoById(ProductInfo product);
	/**
	 * 可接单量
	 * **/
	public Long porductAvailQty(TscmProductcolourstyle prdcolsty);
	
	/**
	 * 商品信息
	 * **/
	public List<TscmProduct>selectInfoByProduct(TscmProduct product);
	
	/**
	 * 商品颜色款式信息
	 * **/
	public List<TscmProductcolourstyle>selectProductColourStyleByProduct(TscmProductcolourstyle product);
	
	/**
	 * 商品主档信息
	 * **/
	public List<TscmProductgeneral>selectProductGeneralProduct(TscmProductgeneral product);
	
	/**
	 * 商品配送信息
	 * **/
	public List<TscmProductlogistic>selectProductLogisticProduct(TscmProductlogistic product);
	/**
	 * 商品仓库信息
	 * **/
	public List<TscmProductwarehouse>selectProductWarehouseProduct(TscmProductwarehouse product);
	
	/**
	 * 商品颜色信息
	 * **/
	public List<TscmProductcolourstyle>selectProductColourByProduct(TscmProductcolourstyle product);
	
	/**
	 * 商品款式信息
	 * **/
	public List<TscmProductcolourstyle>selectProductStyleByProduct(TscmProductcolourstyle product);
	
	/**
	 * 商品库存信息
	 * **/
	public TscmProductcolourstyle selectStockProductByProduct(TscmProductcolourstyle product);
	
	/**
	 * 佣金商品资料修改
	 */
	public TscmProduct updateProductInfoByCommission(TscmProduct product)
			throws Exception;
	
	/**
	 * 佣金商品新增颜色款式
	 */
	public TscmProductcolourstyle insertProductColourStyleByCommission(
			TscmProductcolourstyle product) throws Exception;
	
	/**
	 * 佣金商品修改颜色款式
	 */
	public TscmProductcolourstyle updateProductColourStyleByCommission(
			TscmProductcolourstyle product) throws Exception;
	
	/**
	 * 佣金商品添加主商品规格说明
	 */
	public TscmProductgeneral insertProductGeneralByCommission(
			TscmProductgeneral product) throws Exception;
}

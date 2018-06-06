package com.best1.api.service.scm.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.scm.product.ProductInfo;
import com.best1.api.entity.scm.product.TscmProduct;
import com.best1.api.entity.scm.product.TscmProductcolourstyle;
import com.best1.api.entity.scm.product.TscmProductcolourstyleExample;
import com.best1.api.entity.scm.product.TscmProductgeneral;
import com.best1.api.entity.scm.product.TscmProductgeneralExample;
import com.best1.api.entity.scm.product.TscmProductlogistic;
import com.best1.api.entity.scm.product.TscmProductwarehouse;
import com.best1.api.mapper.scm.TscmProductMapper;
import com.best1.api.service.scm.ProductManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.SCMConstant;
@Component
@Transactional
@Monitored
public class ProductManageSereviceImpl implements ProductManageSerevice {
	private static Logger logger = LoggerFactory
			.getLogger(ProductManageSereviceImpl.class);
	
	@Autowired
	private TscmProductMapper  productDao;
	
	@Override
	public List<ProductInfo> selectProductInfoById(ProductInfo product) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_PRODUCTID, product.getProductid());
		productDao.selectByProdInfo(paramMap);
		List<ProductInfo> products =(List<ProductInfo> )paramMap
				.get(APIConstant.SP_RI_INFO);
		return products;
	}

	@Override
	public Long porductAvailQty(TscmProductcolourstyle prdcolsty) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_PRODUCTID, prdcolsty.getProductid());
		paramMap.put(APIConstant.SP_COLORCODE, prdcolsty.getColourcode());
		paramMap.put(APIConstant.SP_STYLECODE, prdcolsty.getStylecode());
		return productDao.porductAvailQty(paramMap);
	}

	@Override
	public List<TscmProduct> selectInfoByProduct(TscmProduct product) {
		// TODO Auto-generated method stub
		return productDao.selectInfoByProduct(product);
	}

	@Override
	public List<TscmProductcolourstyle> selectProductColourStyleByProduct(
			TscmProductcolourstyle product) {
		// TODO Auto-generated method stub
		return productDao.selectProductColourStyleByProduct(product);
	}

	@Override
	public List<TscmProductgeneral> selectProductGeneralProduct(
			TscmProductgeneral product) {
		// TODO Auto-generated method stub
		return productDao.selectProductGeneralProduct(product);
	}

	@Override
	public List<TscmProductlogistic> selectProductLogisticProduct(
			TscmProductlogistic product) {
		// TODO Auto-generated method stub
		return productDao.selectProductLogisticProduct(product);
	}

	@Override
	public List<TscmProductwarehouse> selectProductWarehouseProduct(
			TscmProductwarehouse product) {
		// TODO Auto-generated method stub
		return productDao.selectProductWarehouseProduct(product);
	}

	@Override
	public List<TscmProductcolourstyle> selectProductColourByProduct(
			TscmProductcolourstyle product) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_V_PRODUCTID, product.getProductid());
		productDao.selectPorductColor(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_V_RTN_CODE);
		if(rtncode!=null&&rtncode.intValue()==APIConstant.RTNCODE_OK){
		List<TscmProductcolourstyle> prdcolours =( List<TscmProductcolourstyle> )paramMap
				.get(APIConstant.SP_V_RTN_DATA);
		
		return prdcolours;
		}
		return null;
	}

	@Override
	public List<TscmProductcolourstyle> selectProductStyleByProduct(
			TscmProductcolourstyle product) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_V_PRODUCTID, product.getProductid());
		productDao.selectPorductStyle(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_V_RTN_CODE);
		if(rtncode!=null&&rtncode.intValue()==APIConstant.RTNCODE_OK){
		List<TscmProductcolourstyle> prdstyles =( List<TscmProductcolourstyle> )paramMap
				.get(APIConstant.SP_V_RTN_DATA);
	
		return prdstyles;
		}
		return null;
	}

	@Override
	public TscmProductcolourstyle selectStockProductByProduct(
			TscmProductcolourstyle prdcolourstyle) {
		int rtncodeint=-100;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.AI_PRODUCTID, prdcolourstyle.getProductid());
		paramMap.put(APIConstant.AI_PRODUCTVERSION, prdcolourstyle.getProductversion());
		paramMap.put(APIConstant.AI_COLOURCODE, prdcolourstyle.getColourcode());
		paramMap.put(APIConstant.AI_COLOURCLASS, prdcolourstyle.getColourclass());
		paramMap.put(APIConstant.AI_STYLECODE, prdcolourstyle.getStylecode());
		paramMap.put(APIConstant.AI_STYLECLASS, prdcolourstyle.getStyleclass());
		productDao.selectStockProd(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.AI_RTN_code);		
		String rtnmsg = (String) paramMap
				.get(APIConstant.AI_RTN_msg);	
		if(rtncode!=null)
		{	 rtncodeint=rtncode.intValue();
		prdcolourstyle.setRtncode(rtncodeint);
		}
		prdcolourstyle.setRtnmsg(rtnmsg);
		if(rtncodeint==APIConstant.RTNCODE_OK){
		java.math.BigDecimal productavailaleqty = (java.math.BigDecimal) paramMap
				.get(APIConstant.AI_PRODUCTAVAILALEQTY);
		if(productavailaleqty!=null)
		prdcolourstyle.setProductavailaleqty(productavailaleqty.intValue());
		java.math.BigDecimal productmaxqty = (java.math.BigDecimal) paramMap
				.get(APIConstant.AI_PRODUCTMAXQTY);
		if(productmaxqty!=null)
		prdcolourstyle.setProductmaxqty(productmaxqty.intValue());
		}
	
		return prdcolourstyle;
	}

	@Override
	public TscmProduct updateProductInfoByCommission(TscmProduct product)
			throws Exception {
		if (isScmProduct(product.getProductid())) {
			if (isCommissionProduct(product.getProductid())) {
				product.setLastmodifiedtimestamp(DateUtil.getTodayTime());
				int count = productDao
						.updateProductByPrimaryKeySelective(product);
				if (count > 0) {
					product.setRtncode(APIConstant.RTNCODE_OK);
				}
			} else {
				product.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
			}
		} else {
			product.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return product;
	}

	@Override
	public TscmProductcolourstyle insertProductColourStyleByCommission(
			TscmProductcolourstyle product) throws Exception {
		if (isScmProduct(product.getProductid())) {
			if (isCommissionProduct(product.getProductid())) {
				if (existColourStyle(product.getProductid(),
						product.getColourcode(), product.getColourclass(),
						product.getStylecode(), product.getStyleclass())) {
					product.setRtncode(APIConstant.RTNCODE_FAIL);
				} else {
					product.setCreatedtimestamp(DateUtil.getTodayTime());
					product.setLastmodifiedby(product.getCreatedby());
					product.setLastmodifiedtimestamp(DateUtil.getTodayTime());
					int count = productDao
							.insertProductcolourstyleSelective(product);
					if (count > 0) {
						product.setRtncode(APIConstant.RTNCODE_OK);
					}
				}
			} else {
				product.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
			}
		} else {
			product.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return product;
	}

	@Override
	public TscmProductcolourstyle updateProductColourStyleByCommission(
			TscmProductcolourstyle product) throws Exception {
		if (isScmProduct(product.getProductid())) {
			if (isCommissionProduct(product.getProductid())) {
				if (!existColourStyle(product.getProductid(),
						product.getColourcode(), product.getColourclass(),
						product.getStylecode(), product.getStyleclass())) {
					product.setRtncode(APIConstant.RTNCODE_FAIL);
				} else {
					product.setLastmodifiedtimestamp(DateUtil.getTodayTime());
					if (product.getForsale() != null) {
						product.setForsalelastmodifiedby(product
								.getLastmodifiedby());
						product.setForsalelastmodifiedtimestamp(DateUtil
								.getTodayTime());
					}
					int count = productDao
							.updateProductcolourstyleByExample(product);
					if (count > 0) {
						product.setRtncode(APIConstant.RTNCODE_OK);
					}
				}
			} else {
				product.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
			}
		} else {
			product.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return product;
	}
	
	/**
	 * 判断是否为佣金商品
	 */
	private boolean isCommissionProduct(Long productid) {
		TscmProduct product = new TscmProduct();
		product.setProductid(productid);
		List<TscmProduct> tscmproducts = productDao
				.selectInfoByProduct(product);
		if (tscmproducts != null
				&& tscmproducts.size() > 0
				&& tscmproducts.get(0).getProductcategory() == SCMConstant.SCM_PROD_CATEGORY_COMMISSION) {
			return true;
		}
		return false;
	}

	@Override
	public TscmProductgeneral insertProductGeneralByCommission(
			TscmProductgeneral product) throws Exception {
		if (isScmProduct(product.getProductid())) {
			if (isCommissionProduct(product.getProductid())) {
				TscmProductgeneralExample example = new TscmProductgeneralExample();
				TscmProductgeneralExample.Criteria criteria = example
						.createCriteria();
				criteria.andProductidEqualTo(product.getProductid());
				criteria.andGeneralinfocodeEqualTo(SCMConstant.SCM_PROD_GENERAL_USAGE);
				Integer commentsequence = productDao
						.productGeneralSequenceMax(example);
				product.setCommentsequence(++commentsequence);

				product.setCreatedtimestamp(DateUtil.getTodayTime());
				product.setLastmodifiedby(product.getCreatedby());
				product.setLastmodifiedtimestamp(DateUtil.getTodayTime());
				product.setGeneralinfocode(SCMConstant.SCM_PROD_GENERAL_USAGE);
				if (product.getCommenttype() == null) {
					product.setCommenttype(SCMConstant.SCM_PROD_GENERAL_COMMENT_TYPE_DEFAULT);
				}
				int count = productDao.insertProductGeneralSelective(product);
				if (count > 0) {
					product.setRtncode(APIConstant.RTNCODE_OK);
				}
			} else {
				product.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
			}
		} else {
			product.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return product;
	}
	
	/**
	 * 判断是否为scm商品
	 */
	private boolean isScmProduct(Long productid) {
		TscmProduct product = new TscmProduct();
		product.setProductid(productid);
		List<TscmProduct> products = productDao.selectInfoByProduct(product);
		if (products != null && products.size() > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * 判断颜色款式是否存在
	 */
	private boolean existColourStyle(Long productid, Integer colourcode,
			Integer colourclass, Integer stylecode, Integer styleclass) {
		TscmProductcolourstyleExample example = new TscmProductcolourstyleExample();
		TscmProductcolourstyleExample.Criteria criteria = example
				.createCriteria();
		criteria.andProductidEqualTo(productid);
		criteria.andColourcodeEqualTo(colourcode);
		criteria.andColourclassEqualTo(colourclass);
		criteria.andStylecodeEqualTo(stylecode);
		criteria.andStyleclassEqualTo(styleclass);
		List<TscmProductcolourstyle> colourstyles = productDao
				.selectProductcolourstyleByExample(example);
		if (colourstyles != null && colourstyles.size() > 0) {
			return true;
		}
		return false;
	}
	
}

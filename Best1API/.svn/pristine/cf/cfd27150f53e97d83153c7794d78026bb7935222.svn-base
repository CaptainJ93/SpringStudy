package com.best1.api.service.scm.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.scm.product.TscmProductimage;
import com.best1.api.entity.scm.product.TspmProductattribute;
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
import com.best1.api.mapper.scm.TspmProductMapper;
import com.best1.api.service.scm.SpmProductManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.SCMConstant;
import com.best1.api.utils.StrUtils;

@Component
@Transactional
@Monitored
public class SpmProductManageSereviceImpl implements SpmProductManageSerevice {
	private static Logger logger = LoggerFactory
			.getLogger(SpmProductManageSereviceImpl.class);

	@Autowired
	private TspmProductMapper spmProductDao;

	@Override
	public TspmProduct spmProductImport(TspmProduct spmproduct) {
		boolean createspmProductable = true;// 判断spmproduct各项参数是否满足业务要求
		if (spmproduct.getDeliverytype() == SCMConstant.SCM_PROD_DELIVERY_TYPE_NORMAL) {// 当配送方式为库送时
			// 子配送类别不能为到厂取货,子销退类别不能为到厂取货,接单方式不能为无限制
			if (spmproduct.getSubdeliverytype() == SCMConstant.SCM_PROD_SUBDELIVERY_TYPE_CARRIERTOPICKUP
					|| spmproduct.getSubreturntype() == SCMConstant.SCM_PROD_SUBRETURN_TYPE_CARRIERTOPICKUP
					|| spmproduct.getSalestype() == SCMConstant.SCM_PROD_SALES_TYPE_NO_LIMIT) {
				spmproduct.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
				createspmProductable = false;
			}
		}
		if (createspmProductable) {
			if (spmproduct.getMaximumquantity() == null) {
				// 最大供应量默认:900000
				spmproduct.setMaximumquantity(new Long(
						SCMConstant.SCM_PROD_PENDING_MAXIMUM_QTY));
			}
			if (spmproduct.getLeadtime() == null) {
				// 备货时间默认：7天
				spmproduct.setLeadtime(SCMConstant.SCM_PROD_PENDING_LEADTIME);
			}
			if (spmproduct.getEconomicorderquantity() == null) {
				// 经济运送量默认：1
				spmproduct.setEconomicorderquantity(new Long(
						SCMConstant.SCM_PROD_PENDING_ECONOMICORDER_QTY));
			}
			if (spmproduct.getQuantityprocessedperday() == null) {
				// 每日可处理量默认：1
				spmproduct.setQuantityprocessedperday(new Long(
						SCMConstant.SCM_PROD_PENDING_PROCESSEDPERDAY_QTY));
			}
			if (spmproduct.getPurchaseid() == null) {
				// MA默认为：999999
				spmproduct.setPurchaseid(new Long(
						SCMConstant.SCM_PROD_PENDING_PURCHASEID));
			}
			spmproduct.setProductstatus(SCMConstant.SCM_PROD_STATUS_BLOCKED);
			spmproduct.setLastmodifiedby(spmproduct.getCreatedby());
			spmproduct.setCreatedtimestamp(DateUtil.getTodayTime());
			spmproduct.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			if (spmproduct.getProductcategory() == SCMConstant.SCM_PROD_CATEGORY_COMMISSION) {// 当商品种类为佣金时
				// 配送方式为指送
				spmproduct
						.setDeliverytype(SCMConstant.SCM_PROD_DELIVERY_TYPE_DIRECT);
				// 销退方式为指送
				spmproduct
						.setReturntype(SCMConstant.SCM_PROD_RETURN_TYPE_DIRECT);
				// 子配送类别为一般
				spmproduct
						.setSubdeliverytype(SCMConstant.SCM_PROD_SUBDELIVERY_TYPE_NORMAL);
				// 子销退类别为一般
				spmproduct
						.setSubreturntype(SCMConstant.SCM_PROD_SUBRETURN_TYPE_NORMAL);
				// 接单方式为无限制
				spmproduct
						.setSalestype(SCMConstant.SCM_PROD_SALES_TYPE_NO_LIMIT);
				// 毋需采购单
				spmproduct.setPotype(SCMConstant.SCM_PROD_PO_TYPE_NOTREQUIRED);
				// 专属公司为3
				//spmproduct.setCompanyid(SCMConstant.SCM_PROD_COMPANYID_THREE);
			}
			if (spmproduct.getProductcategory() == SCMConstant.SCM_PROD_CATEGORY_CONSIGNMENT) {// 当商品种类为寄卖时
				// 采购单类别为一般
				spmproduct.setPotype(SCMConstant.SCM_PROD_PO_TYPE_NORMAL);
				// 专属公司为2
				spmproduct.setCompanyid(SCMConstant.SCM_PROD_COMPANYID_TWO);
			}
			/**if (spmproduct.getDeliverytype() == SCMConstant.SCM_PROD_DELIVERY_TYPE_DIRECT) {// 当配送方式为指送时
				// 接单方式为依采购单
				spmproduct.setSalestype(SCMConstant.SCM_PROD_SALES_TYPE_BY_PO);
			}**/
			int count = spmProductDao.createspmProduct(spmproduct);
			if (count > 0) {
				spmproduct.setRtncode(APIConstant.RTNCODE_OK);
			}
		}

		return spmproduct;
	}

	@Override
	public TspmProductcolourstyle spmPrdcolourstyleImport(
			TspmProductcolourstyle spmprdcolourstyle) {
		if (isSpmProduct(spmprdcolourstyle.getProductid())) {
			TspmProductcolourstyleExample colourstyleexample = new TspmProductcolourstyleExample();
			TspmProductcolourstyleExample.Criteria colourstylecriteria = colourstyleexample
					.createCriteria();
			colourstylecriteria.andProductidEqualTo(spmprdcolourstyle
					.getProductid());
			colourstylecriteria.andColourcodeEqualTo(spmprdcolourstyle
					.getColourcode());
			colourstylecriteria.andColourclassEqualTo(spmprdcolourstyle
					.getColourclass());
			colourstylecriteria.andStylecodeEqualTo(spmprdcolourstyle
					.getStylecode());
			colourstylecriteria.andStyleclassEqualTo(spmprdcolourstyle
					.getStyleclass());
			List<TspmProductcolourstyle> TspmProductcolourstyles = spmProductDao
					.selectProductcolourstyleByExample(colourstyleexample);
			if (TspmProductcolourstyles != null
					&& TspmProductcolourstyles.size() > 0) {
				spmprdcolourstyle.setRtncode(APIConstant.RTNCODE_FAIL);
			} else {
				if (spmprdcolourstyle.getQuantity() == null) {
					spmprdcolourstyle.setQuantity(new Long(
							SCMConstant.SCM_PROD_PENDING_QUANTITY));
				}
				spmprdcolourstyle.setCreatedtimestamp(DateUtil.getTodayTime());
				spmprdcolourstyle.setLastmodifiedby(spmprdcolourstyle
						.getCreatedby());
				spmprdcolourstyle.setLastmodifiedtimestamp(DateUtil
						.getTodayTime());
				int count = spmProductDao
						.spmProductColourStyleImport(spmprdcolourstyle);
				if (count > 0) {
					spmprdcolourstyle.setRtncode(APIConstant.RTNCODE_OK);
				}
			}
		} else {
			spmprdcolourstyle.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return spmprdcolourstyle;
	}

	@Override
	public TspmProductgeneral spmPrdgeneralImport(
			TspmProductgeneral spmprdgeneral) {
		if (isSpmProduct(spmprdgeneral.getProductid())) {
			Integer commentsequence = null;
			TspmProductgeneralExample example = new TspmProductgeneralExample();
			TspmProductgeneralExample.Criteria criteria = example
					.createCriteria();
			criteria.andProductidEqualTo(spmprdgeneral.getProductid());
			criteria.andGeneralinfocodeEqualTo(spmprdgeneral
					.getGeneralinfocode());
			criteria.andCommenttypeEqualTo(spmprdgeneral.getCommenttype());
			commentsequence = spmProductDao
					.spmProductGeneralSequenceMax(example);
			if (commentsequence != null) {
				commentsequence++;
			} else {
				commentsequence = 1;
			}
			spmprdgeneral
					.setCommenttype(SCMConstant.SCM_PROD_GENERAL_COMMENT_TYPE_DEFAULT);
			spmprdgeneral.setLastmodifiedby(spmprdgeneral.getCreatedby());
			spmprdgeneral.setCreatedtimestamp(DateUtil.getTodayTime());
			spmprdgeneral.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			String[] comments = StrUtils.split(spmprdgeneral.getComments(),SCMConstant.SCM_PROD_GENERAL_COMMENTS_MAXLENGTH);
			if (comments != null) {
				for (String comment : comments) {
					spmprdgeneral.setComments(comment);
					spmprdgeneral.setCommentsequence(commentsequence++);
					spmProductDao.spmProductGeneralImport(spmprdgeneral);
				}
			}
			spmprdgeneral.setRtncode(APIConstant.RTNCODE_OK);
		} else {
			spmprdgeneral.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return spmprdgeneral;
	}

	@Override
	public TscmProductimage spmPrdimageImport(TscmProductimage spmprodimage) {
		if (isSpmProduct(spmprodimage.getSpmproductid())) {
			spmprodimage
					.setProductversion(SCMConstant.SCM_PRODUCT_START_VERSION);
			spmprodimage
					.setStatus(SCMConstant.SCM_PRODIMAGESTATUS_IMPORTREQUEST);
			spmprodimage.setCreatedtimestamp(DateUtil.getTodayTime());
			spmprodimage.setLastmodifiedby(spmprodimage.getCreatedby());
			spmprodimage.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			int count = spmProductDao.spmProductImageImport(spmprodimage);
			if (count > 0) {
				spmprodimage.setRtncode(APIConstant.RTNCODE_OK);
			}
		} else {
			spmprodimage.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return spmprodimage;
	}

	@Override
	public TspmProductwarehouse spmPrdwarehouseImport(
			TspmProductwarehouse spmprodwarehouse) {
		if (isSpmProduct(spmprodwarehouse.getProductid())) {
			TspmProduct product = spmProductDao
					.selectSpmProductByPrimaryKey(spmprodwarehouse
							.getProductid());
			if (product.getDeliverytype() != SCMConstant.SCM_PROD_DELIVERY_TYPE_DIRECT
					&& product.getProductcategory() != SCMConstant.SCM_PROD_CATEGORY_COMMISSION) {
				TspmProductwarehouseExample example = new TspmProductwarehouseExample();
				TspmProductwarehouseExample.Criteria criteria = example
						.createCriteria();
				criteria.andProductidEqualTo(spmprodwarehouse.getProductid());
				criteria.andWarehouseidEqualTo(spmprodwarehouse
						.getWarehouseid());
				List<TspmProductwarehouse> spmprodwarehouses = spmProductDao
						.selectProductwarehouseByExample(example);
				if (spmprodwarehouses != null && spmprodwarehouses.size() > 0) {
					spmprodwarehouse.setRtncode(APIConstant.RTNCODE_FAIL);
				} else {
					spmprodwarehouse.setCreatedtimestamp(DateUtil
							.getTodayTime());
					spmprodwarehouse.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					spmprodwarehouse.setLastmodifiedby(spmprodwarehouse
							.getCreatedby());
					int count = spmProductDao
							.spmProductWarehouseImport(spmprodwarehouse);
					if (count > 0) {
						spmprodwarehouse.setRtncode(APIConstant.RTNCODE_OK);
					}
				}
			} else {
				spmprodwarehouse.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
			}
		} else {
			spmprodwarehouse.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return spmprodwarehouse;
	}

	@Override
	public TspmProductattribute spmPrdattributeImport(
			TspmProductattribute spmproductattribute) {
		if (isSpmProduct(spmproductattribute.getProductid())) {
			TspmProductattributeExample attributeexample = new TspmProductattributeExample();
			TspmProductattributeExample.Criteria attributecriteria = attributeexample
					.createCriteria();
			attributecriteria.andProductidEqualTo(spmproductattribute
					.getProductid());
			attributecriteria.andAttributecategoryidEqualTo(spmproductattribute
					.getAttributecategoryid());
			attributecriteria.andAttributevalueEqualTo(spmproductattribute
					.getAttributevalue());
			List<TspmProductattribute> spmproductattributes = spmProductDao
					.selectProductattributeByExample(attributeexample);
			if (spmproductattributes != null && spmproductattributes.size() > 0) {
				spmproductattribute.setRtncode(APIConstant.RTNCODE_FAIL);
			} else {
				spmproductattribute
						.setCreatedtimestamp(DateUtil.getTodayTime());
				int count = spmProductDao
						.spmProductattributeImport(spmproductattribute);
				if (count > 0) {
					spmproductattribute.setRtncode(APIConstant.RTNCODE_OK);
				}
			}
		} else {
			spmproductattribute.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return spmproductattribute;
	}
	
	/**
	 * 判断是否为spm商品
	 */
	private boolean isSpmProduct(Long productid) {
		TspmProductExample example = new TspmProductExample();
		TspmProductExample.Criteria criteria = example.createCriteria();
		criteria.andProductidEqualTo(productid);
		List<TspmProduct> tspmproducts = spmProductDao
				.selectSpmProductByExample(example);
		if (tspmproducts != null && tspmproducts.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public TscmSpmscmproduct selectTscmSpmscmproduct(Long spmProductId) {
		TscmSpmscmproduct product = null;
		TscmSpmscmproductExample example = new TscmSpmscmproductExample();
		TscmSpmscmproductExample.Criteria criteria = example.createCriteria();
		criteria.andSpmproductidEqualTo(spmProductId);
		List<TscmSpmscmproduct> list = spmProductDao
				.selectSpmscmproductByExample(example);
		if (list != null && list.size() > 0) {
			product = list.get(0);
		}
		return product;
	}

	@Override
	public TscmSpmscmproduct tscmSpmscmproduct(
			TscmSpmscmproduct tscmSpmscmproduct) {
		tscmSpmscmproduct = selectTscmSpmscmproduct(tscmSpmscmproduct
				.getSpmproductid());
		if (tscmSpmscmproduct == null) {
			tscmSpmscmproduct = new TscmSpmscmproduct();
			tscmSpmscmproduct.setRtncode(APIConstant.RTNCODE_NO_DATA);
		} else {
			tscmSpmscmproduct.setRtncode(APIConstant.RTNCODE_OK);
		}
		return tscmSpmscmproduct;
	}
}

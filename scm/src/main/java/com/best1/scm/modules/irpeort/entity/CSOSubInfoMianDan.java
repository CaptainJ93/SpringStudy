package com.best1.scm.modules.irpeort.entity;

import static org.apache.commons.lang3.StringUtils.trimToEmpty;

import java.math.BigDecimal;

import com.best1.scm.common.utils.ChineseMoneyScriptlet;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.entity.ScmSupplierShipConfirmInfo;

public class CSOSubInfoMianDan {
	private String productStyleDesc;
	private String productId;
	private String productColorDesc;
	private String productName;
	private String packageWeight;
	private String codAmount;
	private String orderId;
	private String codAmountCN;

	public String getProductStyleDesc() {
		return productStyleDesc;
	}

	public void setProductStyleDesc(String productStyleDesc) {
		this.productStyleDesc = productStyleDesc;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductColorDesc() {
		return productColorDesc;
	}

	public void setProductColorDesc(String productColorDesc) {
		this.productColorDesc = productColorDesc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPackageWeight() {
		return packageWeight;
	}

	public void setPackageWeight(String packageWeight) {
		this.packageWeight = packageWeight;
	}

	public String getCodAmount() {
		return codAmount;
	}

	public void setCodAmount(String codAmount) {
		this.codAmount = codAmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCodAmountCN() {
		return codAmountCN;
	}

	public void setCodAmountCN(String codAmountCN) {
		this.codAmountCN = codAmountCN;
	}

	public void setValue(ScmSupplierCsoinfo csoinfo, ScmSupplierShipConfirmInfo confirmInfo) {
		Double codAmount = csoinfo.getCodamount();
		if (codAmount == null) {
			setCodAmount("0");
			setCodAmountCN("零");
		} else {
			codAmount = new BigDecimal(codAmount).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			setCodAmount(codAmount.toString());
			setCodAmountCN(new ChineseMoneyScriptlet().showChinese(getCodAmount().toString()));
		}
		setProductColorDesc(trimToEmpty(csoinfo.getProductcolourdescription()));
		setProductStyleDesc(trimToEmpty(csoinfo.getProductstyledescription()));
		Long productId = csoinfo.getProductid();
		setProductId(productId == null ? StringUtils.EMPTY : productId.toString());
		setProductName(trimToEmpty(csoinfo.getProductname()));
		Double weight = confirmInfo.getPackageWeight();
		if (weight == null || weight == 0) {
			setPackageWeight(StringUtils.EMPTY);
		} else {
			weight *= 1000;
			weight = new BigDecimal(weight).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
			setPackageWeight(weight.toString() + "(g)");
		}
		Long orderId = csoinfo.getOrderid();
		setOrderId(orderId == null ? StringUtils.EMPTY : orderId.toString());
	}
}

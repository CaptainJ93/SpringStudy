package com.best1.api.service.scm.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
import com.best1.api.entity.scm.supplier.TscmSupplierpendaddressExample;
import com.best1.api.entity.scm.supplier.TscmSupplierpendbusiness;
import com.best1.api.entity.scm.supplier.TscmSupplierpending;
import com.best1.api.entity.scm.supplier.TscmSupplierpendingExample;
import com.best1.api.mapper.scm.TscmSupplierMapper;
import com.best1.api.mapper.scm.TscmSupplieraddressMapper;
import com.best1.api.mapper.scm.TscmSupplierbusinessMapper;
import com.best1.api.mapper.scm.TscmSuppliercontractMapper;
import com.best1.api.mapper.scm.TscmSuppliercontractpendingMapper;
import com.best1.api.mapper.scm.TscmSupplierdeliveryMapper;
import com.best1.api.mapper.scm.TscmSupplierdeliverypendingMapper;
import com.best1.api.mapper.scm.TscmSuppliermasterMapper;
import com.best1.api.service.scm.SupplierManageService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.SCMConstant;
import com.best1.api.utils.StrUtils;

@Component
@Transactional
@Monitored
public class SupplierManageServiceImpl implements SupplierManageService{
	
	@Autowired 
	private TscmSupplierMapper supplierMapper;
	
	@Autowired
	private TscmSupplieraddressMapper supplierAddressMapper;
	
	@Autowired
	private TscmSupplierbusinessMapper supplierBusinessMapper;
	
	@Autowired
	private TscmSuppliercontractMapper supplierContractMapper;
	
	@Autowired
	private TscmSuppliercontractpendingMapper supplierContractPendingMapper;
	
	@Autowired
	private TscmSupplierdeliverypendingMapper supplierDeliveryPendingMapper;
	
	@Autowired
	private TscmSuppliermasterMapper supplierMasterMapper;
	
	@Autowired
	private TscmSupplierdeliveryMapper supplierDeliveryMapper;

	@Override
	public TscmSupplierpending addSupplierInfo(TscmSupplierpending tscmSupplierpending,TcmnSpmuser spmUser ) {
		String supplierRegNo = tscmSupplierpending.getSupplierregno();//供应商税号
		int count = supplierMapper.getRowCount(supplierRegNo);
		if (count == 0) {
			tscmSupplierpending.setSupplierid(supplierMapper.selectSupplierId());
			int count1 = supplierMapper.supplierPendingImport(tscmSupplierpending);
			if (count1 > 0) {
				spmUser.setPassword(StrUtils.getRandomString(6));
				spmUser.setUsername(tscmSupplierpending.getSuppliername());
				spmUser.setRoleid(SCMConstant.ROLE_ID);
				spmUser.setCommunicationtype(SCMConstant.COMMUNICATION_TYPE);
				spmUser.setMobileno(tscmSupplierpending.getContactpersonmobileno());
				spmUser.setEmailid(tscmSupplierpending.getContactpersonemailid());
				spmUser.setStatus(SCMConstant.STATUS1);
				spmUser.setUserid(tscmSupplierpending.getSupplierid());
				spmUser.setCreatedby(tscmSupplierpending.getCreatedby());
				spmUser.setLastmodifiedby(tscmSupplierpending.getCreatedby());
				spmUser.setAvailabletrypasscount(SCMConstant.AVAILABLE_TRY_PASSCOUNT);
				spmUser.setPasswordinterval(SCMConstant.PASSWORD_INTERVAL);
				spmUser.setLockstatus(SCMConstant.LOCK_STATUS);
				spmUser.setStartdate(DateUtil.getTodayTime());
				spmUser.setEnddate(DateUtil.getTodayTimeADDYear(SCMConstant.SPM_YEAR_AMOUNT));
				spmUser.setLockstartdatetime(DateUtil.getTodayTime());
				spmUser.setLockinterval(SCMConstant.LOCK_INTERVAL);
				spmUser.setTrypasscount(SCMConstant.SPM_TRYPASSCOUNT);
				spmUser.setPasswordcreateddatetime(DateUtil.getTodayTime());
				spmUser.setLogmaximum(SCMConstant.LOG_MAXIMUM);
				spmUser.setCreatedtimestamp(DateUtil.getTodayTime());
				spmUser.setLastmodifiedtimestamp(DateUtil.getTodayTime());
				tscmSupplierpending.setRtncode(APIConstant.RETURN_OK);
				tscmSupplierpending.setRtnmsg(APIConstant.RETURN_SUCCESS_FROM_ET1);
				spmUser = this.addSpmSupplierUser(spmUser);
			} else {
				tscmSupplierpending.setRtncode(APIConstant.RETURN_FAILED);
				tscmSupplierpending.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
			}
		} else {
			tscmSupplierpending.setRtncode(APIConstant.RETURN_FAILED);
			tscmSupplierpending.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
		}
		return tscmSupplierpending;
		
	}

	@Override
	public TscmSupplierpendaddress addSupplierAddressInfo(TscmSupplierpendaddress supplierAddress) {
		TscmSupplierpendaddressExample example =new TscmSupplierpendaddressExample();
		TscmSupplierpendaddressExample.Criteria criteria=example.createCriteria();
		criteria.andSupplierrecordidEqualTo(supplierAddress.getSupplierrecordid());
		criteria.andAddresstypeEqualTo(supplierAddress.getAddresstype());
		Integer addresssequence=supplierMapper.supplierAddressSequenceMax(example);
		if(addresssequence==null||addresssequence==0)
			addresssequence=1;
		else
			addresssequence++;
		supplierAddress.setAddresssequence(addresssequence);
		int count = supplierMapper.supplierAddressImport(supplierAddress);
		if (count > 0) {
			supplierAddress.setRtncode(APIConstant.RETURN_OK);
			supplierAddress.setRtnmsg(APIConstant.RETURN_SUCCESS_FROM_ET1);
		} else {
			supplierAddress.setRtncode(APIConstant.RETURN_FAILED);
			supplierAddress.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
		}
		return supplierAddress;
		
	}

	@Override
	public TscmSupplierpendbusiness addSupplierBussiness(TscmSupplierpendbusiness supplierBusiness) {
		TscmSupplierpendingExample example = new TscmSupplierpendingExample();
		TscmSupplierpendingExample.Criteria criteria = example.createCriteria();
		criteria.andSupplierrecordidEqualTo(supplierBusiness.getSupplierrecordid());
		List<TscmSupplierpending> tscmSupplierpendings = supplierMapper.selectSupplierpendingByExample(example);
		if (tscmSupplierpendings != null && tscmSupplierpendings.size() > 0) {
			int count = supplierMapper.supplierPendBusinessImport(supplierBusiness);
			if (count > 0) {
				supplierBusiness.setRtncode(APIConstant.RETURN_OK);
				supplierBusiness.setRtnmsg(APIConstant.RETURN_SUCCESS_FROM_ET1);
			} else {
				supplierBusiness.setRtncode(APIConstant.RETURN_FAILED);
				supplierBusiness.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
			}
		} else {
			supplierBusiness.setRtncode(APIConstant.RETURN_FAILED);
			supplierBusiness.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
		}

		return supplierBusiness;

	}

	@Override
	public TcmnSpmuser addSpmSupplierUser(TcmnSpmuser spmUser) {
		TscmSupplierpendingExample example = new TscmSupplierpendingExample();
		TscmSupplierpendingExample.Criteria criteria = example.createCriteria();
		criteria.andSupplieridEqualTo(spmUser.getUserid());
		List<TscmSupplierpending> tscmSupplierpendings = supplierMapper.selectSupplierpendingByExample(example);
		if (tscmSupplierpendings != null && tscmSupplierpendings.size() > 0) {
			int count = supplierMapper.supplierUserImport(spmUser);
			if (count > 0) {
				spmUser.setRtncode(APIConstant.RETURN_OK);
				spmUser.setRtnmsg(APIConstant.RETURN_SUCCESS_FROM_ET1);
			} else {
				spmUser.setRtncode(APIConstant.RETURN_FAILED);
				spmUser.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
			}
		} else {
			spmUser.setRtncode(APIConstant.RETURN_FAILED);
			spmUser.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
		}

		return spmUser;

	}

	@Override
	public TscmProductsclass addTscmProductsClass(TscmProductsclass productsClass) {
		TscmSupplierpendingExample example = new TscmSupplierpendingExample();
		TscmSupplierpendingExample.Criteria criteria = example.createCriteria();
		criteria.andSupplieridEqualTo(productsClass.getSupplierid());
		List<TscmSupplierpending> tscmSupplierpendings = supplierMapper.selectSupplierpendingByExample(example);
		if (tscmSupplierpendings != null && tscmSupplierpendings.size() > 0) {
			int count = supplierMapper.supplierPrdSclassImport(productsClass);
			if (count > 0) {
				productsClass.setRtncode(APIConstant.RETURN_OK);
				productsClass.setRtnmsg(APIConstant.RETURN_SUCCESS_FROM_ET1);
			} else {
				productsClass.setRtncode(APIConstant.RETURN_FAILED);
				productsClass.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
			}
		} else {
			productsClass.setRtncode(APIConstant.RETURN_FAILED);
			productsClass.setRtnmsg(APIConstant.RETURN_FAILED_FROM_ET1);
		}
		
		return productsClass;
		
	}

	@Override
	public List<TscmSuppliermaster> selectTscmSuppliermasterByExample(
			TscmSuppliermasterExample example) {
		return supplierMasterMapper.selectByExample(example);
	}

	@Override
	public TscmSuppliermaster selectTscmSuppliermasterByKey(Long supplierid) {
		return supplierMasterMapper.selectByPrimaryKey(supplierid);
	}

	@Override
	public List<TscmSupplierdeliverypending> selectTscmSupplierdeliverypendingByExample(
			TscmSupplierdeliverypendingExample example) {
		return supplierDeliveryPendingMapper.selectByExample(example);
	}

	@Override
	public List<TscmSupplierdelivery> selectTscmSupplierdeliveryByExample(
			TscmSupplierdeliveryExample example) {
		return supplierDeliveryMapper.selectByExample(example);
	}

	@Override
	public List<TscmSuppliercontractpending> selectTscmSuppliercontractpendingByExample(
			TscmSuppliercontractpendingExample example) {
		return supplierContractPendingMapper.selectByExample(example);
	}

	@Override
	public TscmSuppliercontractpending selectTscmSuppliercontractpendingByKey(
			TscmSuppliercontractpendingKey key) {
		return supplierContractPendingMapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TscmSuppliercontract> selectTscmSuppliercontractByExample(
			TscmSuppliercontractExample example) {
		return supplierContractMapper.selectByExample(example);
	}

	@Override
	public TscmSuppliercontract selectTscmSuppliercontractByKey(Long contractno) {
		return supplierContractMapper.selectByPrimaryKey(contractno);
	}

	@Override
	public List<TscmSupplierbusiness> selectTscmSupplierbusinessByExample(
			TscmSupplierbusinessExample example) {
		return supplierBusinessMapper.selectByExample(example);
	}

	@Override
	public TscmSupplierbusiness selectTscmSupplierbusinessByKey(
			TscmSupplierbusinessKey key) {
		return supplierBusinessMapper.selectByPrimaryKey(key);
	}

	@Override
	public List<TscmSupplieraddress> selectTscmSupplieraddressByExample(
			TscmSupplieraddressExample example) {
		return supplierAddressMapper.selectByExample(example);
	}

	@Override
	public TscmSupplieraddress selectTscmSupplieraddressByKey(
			TscmSupplieraddressKey key) {
		return supplierAddressMapper.selectByPrimaryKey(key);
	}
	
	
}

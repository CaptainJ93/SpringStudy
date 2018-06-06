/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.modules.supplier.entity.ScmSupplierSrodetail;
import com.best1.scm.modules.supplier.entity.ScmSupplierSroheader;
import com.best1.scm.modules.supplier.dao.ScmSupplierSroheaderDao;

/**
 * 供应商-退货单头信息Service
 * @author admin
 * @version 2016-12-13
 */
@Service
@Transactional(readOnly = true)
public class ScmSupplierSroheaderService extends CrudService<ScmSupplierSroheaderDao, ScmSupplierSroheader> {

	@Autowired
	private ScmSupplierSrodetailService   scmSupplierSrodetailService;
	
	public ScmSupplierSroheader get(String id) {
		return super.get(id);
	}
	
	public List<ScmSupplierSroheader> findList(ScmSupplierSroheader scmSupplierSroheader) {
		return super.findList(scmSupplierSroheader);
	}
	
	public List<ScmSupplierSroheader> findListWithDetail(ScmSupplierSroheader scmSupplierSroheader) {
		
		
		List<ScmSupplierSroheader> scmSupplierSroheaderList = super.findList(scmSupplierSroheader);
		if(null!=scmSupplierSroheaderList){
			for(ScmSupplierSroheader temp:scmSupplierSroheaderList){
				ScmSupplierSrodetail scmSupplierSrodetail = new ScmSupplierSrodetail();
				if(temp.getSubdeliverytype()==SCMConstants.SUB_DELIVERY_TYPE_NORMAL) { //1001一般指送
					scmSupplierSrodetail.setReturnid(temp.getReturnid());
					scmSupplierSrodetail.setSupplierid(temp.getSupplierid());
				}else{
					scmSupplierSrodetail.setReturnid(temp.getReturnid());
				}  
				
				List<ScmSupplierSrodetail> scmSupplierSrodetailList = this.scmSupplierSrodetailService.findList(scmSupplierSrodetail);
				temp.setReturnReturnintransitDetail(scmSupplierSrodetailList);
			}
			
		}
		
		return scmSupplierSroheaderList ;
	}
	
	
	
	public Page<ScmSupplierSroheader> findPage(Page<ScmSupplierSroheader> page, ScmSupplierSroheader scmSupplierSroheader) {
		return super.findPage(page, scmSupplierSroheader);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmSupplierSroheader scmSupplierSroheader) {
		super.save(scmSupplierSroheader);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmSupplierSroheader scmSupplierSroheader) {
		super.delete(scmSupplierSroheader);
	}
	
}
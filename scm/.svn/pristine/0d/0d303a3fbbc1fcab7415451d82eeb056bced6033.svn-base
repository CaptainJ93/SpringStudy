/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.ScmComplaintDetailDao;
import com.best1.scm.modules.delivery.entity.ScmComplaintDetail;
import com.best1.scm.modules.delivery.entity.ScmComplaintHeader;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 配送包裹客诉处理detailService
 * @author admin
 * @version 2016-12-22
 */
@Service
@Transactional(readOnly = true)
public class ScmComplaintDetailService extends CrudService<ScmComplaintDetailDao, ScmComplaintDetail> {

	@Autowired
	private ScmComplaintHeaderService scmComplaintHeaderService;
	
	public ScmComplaintDetail get(String id) {
		return super.get(id);
	}
	
	public List<ScmComplaintDetail> findList(ScmComplaintDetail scmComplaintDetail) {
		return super.findList(scmComplaintDetail);
	}
	
	@Transactional(readOnly = false)
	public Page<ScmComplaintDetail> findPage(Page<ScmComplaintDetail> page, ScmComplaintDetail scmComplaintDetail) {
		Page<ScmComplaintDetail> pagelist=super.findPage(page, scmComplaintDetail);
		List<ScmComplaintDetail> list=pagelist.getList();
		for(ScmComplaintDetail scd:list){
			scd.setCreatename(UserUtils.get(scd.getRecordcreatedby()).getName());
		}
		pagelist.setList(list);
		return pagelist;
	}
	
	@Transactional(readOnly = false)
	public void save(ScmComplaintDetail scmComplaintDetail) {
		updateTime(scmComplaintDetail);
		super.save(scmComplaintDetail);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmComplaintDetail scmComplaintDetail) {
		super.delete(scmComplaintDetail);
	}
	
	@Transactional(readOnly = false)
	public void updateTime(ScmComplaintDetail scmComplaintDetail) {
		ScmComplaintHeader sch=new ScmComplaintHeader();
		sch.setCpid(new Long(scmComplaintDetail.getCpid()));
		List<ScmComplaintHeader> list=scmComplaintHeaderService.findList(sch);
		ScmComplaintHeader scmComplaintHeader=list.get(0);
		if(scmComplaintHeader!=null){
			scmComplaintHeader.setCphandledupdatetime(new Date());
			scmComplaintHeaderService.save(scmComplaintHeader);
		}	
	}
	
	@Transactional(readOnly = false)
	public ScmComplaintHeader getScmComplaintHeader(ScmComplaintDetail scmComplaintDetail){
		ScmComplaintHeader sch=new ScmComplaintHeader();
		sch.setCpid(new Long(scmComplaintDetail.getCpid()));
		List<ScmComplaintHeader> list=scmComplaintHeaderService.findList(sch);
		ScmComplaintHeader scmComplaintHeader=new ScmComplaintHeader();
		if(list!=null&&list.size()>0){
			scmComplaintHeader=list.get(0);
		}	
		return scmComplaintHeader;
	}
	
	@Transactional(readOnly = false)
	public ScmComplaintDetail saveDetail(ScmComplaintDetail scmComplaintDetail){
		ScmComplaintDetail scd=new ScmComplaintDetail();
		scd.setCpid(scmComplaintDetail.getCpid());
		List<ScmComplaintDetail> list=findList(scd);
		scmComplaintDetail.setCphandledseq(list.size()+1000);
		scmComplaintDetail.setRecordcreatedby(UserUtils.getUser().getId());
		scmComplaintDetail.setRecordcreatedtime(new Date());
		scmComplaintDetail.setLastupdatedby(UserUtils.getUser().getId());
		scmComplaintDetail.setLastupdatedtime(new Date());
		return scmComplaintDetail;
	}
}
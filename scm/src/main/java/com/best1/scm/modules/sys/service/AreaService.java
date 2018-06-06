/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.service.TreeService;
import com.best1.scm.modules.sys.dao.AreaDao;
import com.best1.scm.modules.sys.entity.Area;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 区域Service
 * @author ThinkGem
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {

	public List<Area> findAll(){
		return UserUtils.getAreaList();
	}
	
	public List<Area> findListByArea(Area area){
		List<Area> areaList = new ArrayList<Area>();
		areaList = super.findList(area);
		return areaList;
	}
	

	@Transactional(readOnly = false)
	public void save(Area area) {
		List<Area> areaList = new ArrayList<Area>();

		//判定邮编信息不重复
		if((null!=area)&&(area.getZipcode()!=null)){
	    	Area a  = new Area();
	    	a.setZipcode(area.getZipcode());
	    	areaList = super.findList(a);
			if((null!=areaList)&&areaList.size()>0){
				area.setIsNewRecord(false);
				area.setId(areaList.get(0).getId());
			}
	    }
		
		super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
}

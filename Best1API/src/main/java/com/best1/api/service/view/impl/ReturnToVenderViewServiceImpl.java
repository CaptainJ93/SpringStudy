package com.best1.api.service.view.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.view.ReturnToVenderView;
import com.best1.api.mapper.view.ReturnToVenderViewMapper;
import com.best1.api.service.view.ReturnToVenderViewService;

@Component
@Transactional
@Monitored
public class ReturnToVenderViewServiceImpl implements ReturnToVenderViewService {
	@Autowired
	private ReturnToVenderViewMapper returnToVenderViewDAO;

	@Override
	public List<ReturnToVenderView> fetchReturnToVenders(
			ReturnToVenderView returnToVenderView) {
		return returnToVenderViewDAO.fetchReturnToVenders(returnToVenderView);
	}

}

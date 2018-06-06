package com.best1.api.service.cmn.impl;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.cmn.TcmnApiBatchinfo;
import com.best1.api.mapper.cmn.TcmnApiBatchinfoMapper;
import com.best1.api.service.cmn.ApiBatchinfoService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.cmn.ApiBatchinfoDTO;

@Component
@Transactional
@Monitored
public class ApiBatchinfoServiceImpl implements ApiBatchinfoService {

	private static Logger logger = LoggerFactory
			.getLogger(ApiBatchinfoServiceImpl.class);
	@Autowired
	private TcmnApiBatchinfoMapper batchinfoMapperDAO;

	

	@Override
	public int apiDeleteBatchInfo(TcmnApiBatchinfo batchinfo) {

		return batchinfoMapperDAO.deleteByBatchinfo(batchinfo);
	}

	@Override
	public int apiUpdateBatchInfo(TcmnApiBatchinfo batchinfo) {
		batchinfo.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		batchinfo.setStatus(APIConstant.API_TYPE_BATCH_TREATED);
		return batchinfoMapperDAO.updateByBatchinfo(batchinfo);
	}

	@Override
	public List<ApiBatchinfoDTO> apiBatchInfo(TcmnApiBatchinfo batchinfo) {
		batchinfo.setStatus(APIConstant.API_TYPE_BATCH_UNTREATED);
		List<TcmnApiBatchinfo> batchinfoes = batchinfoMapperDAO
				.selectByBatchinfo(batchinfo);
		logger.info(batchinfoes.size() + " ");
		List<ApiBatchinfoDTO> batchinfosDTO = BeanMapper.mapList(batchinfoes,
				ApiBatchinfoDTO.class);
		return batchinfosDTO;
	}

}

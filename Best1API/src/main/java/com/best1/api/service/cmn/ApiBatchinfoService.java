package com.best1.api.service.cmn;

import java.util.List;

import com.best1.api.entity.cmn.TcmnApiBatchinfo;
import com.best1.api.webservice.soap.response.dto.cmn.ApiBatchinfoDTO;

public interface ApiBatchinfoService {
int apiDeleteBatchInfo(TcmnApiBatchinfo batchinfo);
	
	int apiUpdateBatchInfo(TcmnApiBatchinfo batchinfo);
    /**BatchID获取*/
	List<ApiBatchinfoDTO> apiBatchInfo(TcmnApiBatchinfo batchinfo);

	
}

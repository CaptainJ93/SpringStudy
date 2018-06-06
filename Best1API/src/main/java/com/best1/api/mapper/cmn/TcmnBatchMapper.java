package com.best1.api.mapper.cmn;

import com.best1.api.entity.cmn.TcmnBatchrequest;
import com.best1.api.mapper.SqlMapper;

@SqlMapper
public interface TcmnBatchMapper {

public void  batchrequest(TcmnBatchrequest record) ;
}

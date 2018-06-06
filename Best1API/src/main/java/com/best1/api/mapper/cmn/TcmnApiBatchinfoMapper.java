package com.best1.api.mapper.cmn;


import com.best1.api.entity.cmn.TcmnApiBatchinfo;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

@SqlMapper
public interface TcmnApiBatchinfoMapper {

   int deleteByBatchinfo(TcmnApiBatchinfo batchinfo);


    List<TcmnApiBatchinfo> selectByBatchinfo(TcmnApiBatchinfo batchinfo);
    
    
    int updateByBatchinfo(TcmnApiBatchinfo batchinfo);


  
}
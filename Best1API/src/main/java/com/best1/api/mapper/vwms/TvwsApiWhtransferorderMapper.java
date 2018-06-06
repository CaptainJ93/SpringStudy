package com.best1.api.mapper.vwms;

import com.best1.api.entity.vwms.TvwsApiWhtransferorder;
import com.best1.api.entity.vwms.TvwsApiWhtransferorderExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

@SqlMapper
public interface TvwsApiWhtransferorderMapper {
  
    int countByExample(TvwsApiWhtransferorderExample example);

 
    List<TvwsApiWhtransferorder> selectByExample(TvwsApiWhtransferorderExample example);


}
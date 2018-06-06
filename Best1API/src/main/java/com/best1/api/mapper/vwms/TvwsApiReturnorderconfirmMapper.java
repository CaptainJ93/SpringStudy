package com.best1.api.mapper.vwms;

import com.best1.api.entity.vwms.TvwsApiReturnorderconfirm;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirmExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TvwsApiReturnorderconfirmMapper {
  
    int countByExample(TvwsApiReturnorderconfirmExample example);

  
    int deleteByExample(TvwsApiReturnorderconfirmExample example);

   
    int insertSelective(TvwsApiReturnorderconfirm record);

    List<TvwsApiReturnorderconfirm> selectByExample(TvwsApiReturnorderconfirmExample example);

 
    int updateByExampleSelective(@Param("record") TvwsApiReturnorderconfirm record, @Param("example") TvwsApiReturnorderconfirmExample example);

}
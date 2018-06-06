package com.best1.api.mapper.vwms;

import com.best1.api.entity.vwms.TvwsApiRtvconfirm;
import com.best1.api.entity.vwms.TvwsApiRtvconfirmExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface TvwsApiRtvconfirmMapper {

    int countByExample(TvwsApiRtvconfirmExample example);

    int deleteByExample(TvwsApiRtvconfirmExample example);

    int insertSelective(TvwsApiRtvconfirm record);

    List<TvwsApiRtvconfirm> selectByExample(TvwsApiRtvconfirmExample example);

   
    int updateByExampleSelective(@Param("record") TvwsApiRtvconfirm record, @Param("example") TvwsApiRtvconfirmExample example);

}
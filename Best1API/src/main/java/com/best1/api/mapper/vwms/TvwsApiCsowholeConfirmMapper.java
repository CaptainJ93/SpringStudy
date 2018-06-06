package com.best1.api.mapper.vwms;

import com.best1.api.entity.vwms.TvwsApiCsowholeConfirm;
import com.best1.api.entity.vwms.TvwsApiCsowholeConfirmExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TvwsApiCsowholeConfirmMapper {

    int countByExample(TvwsApiCsowholeConfirmExample example);

  
    int deleteByExample(TvwsApiCsowholeConfirmExample example);

   int insertSelective(TvwsApiCsowholeConfirm record);

   
    List<TvwsApiCsowholeConfirm> selectByExample(TvwsApiCsowholeConfirmExample example);

  
    int updateByExampleSelective(@Param("record") TvwsApiCsowholeConfirm record, @Param("example") TvwsApiCsowholeConfirmExample example);

}
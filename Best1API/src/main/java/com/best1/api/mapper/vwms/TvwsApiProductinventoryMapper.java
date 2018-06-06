package com.best1.api.mapper.vwms;

import com.best1.api.entity.vwms.TvwsApiProductinventory;
import com.best1.api.entity.vwms.TvwsApiProductinventoryExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TvwsApiProductinventoryMapper {
 
    int countByExample(TvwsApiProductinventoryExample example);

    int deleteByExample(TvwsApiProductinventoryExample example);

    int insertSelective(TvwsApiProductinventory record);

    
    List<TvwsApiProductinventory> selectByExample(TvwsApiProductinventoryExample example);

    int updateByExampleSelective(@Param("record") TvwsApiProductinventory record, @Param("example") TvwsApiProductinventoryExample example);
    
    void updateInventoryProcedure(TvwsApiProductinventory record);

}
package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmContacthistory;
import com.best1.api.entity.crm.TcrmContacthistoryExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TcrmContacthistoryMapper {

    int countByExample(TcrmContacthistoryExample example);


    int deleteByExample(TcrmContacthistoryExample example);
 
    int insertSelective(TcrmContacthistory record);

 
    List<TcrmContacthistory> selectByExample(TcrmContacthistoryExample example);


    int updateByExampleSelective(@Param("record") TcrmContacthistory record, @Param("example") TcrmContacthistoryExample example);

}
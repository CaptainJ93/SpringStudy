package com.best1.api.mapper.chm;

import com.best1.api.entity.chm.TchmNfmtapedefinition;
import com.best1.api.entity.chm.TchmNfmtapedefinitionExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TchmNfmtapedefinitionMapper {
   
    int countByExample(TchmNfmtapedefinitionExample example);

    
    int deleteByExample(TchmNfmtapedefinitionExample example);

    
    int deleteByPrimaryKey(Integer tapeid);

    
    int insert(TchmNfmtapedefinition record);

  
    int insertSelective(TchmNfmtapedefinition record);


    List<TchmNfmtapedefinition> selectByExample(TchmNfmtapedefinitionExample example);

    
    TchmNfmtapedefinition selectByPrimaryKey(Integer tapeid);

   
    int updateByExampleSelective(@Param("record") TchmNfmtapedefinition record, @Param("example") TchmNfmtapedefinitionExample example);

  
    int updateByExample(@Param("record") TchmNfmtapedefinition record, @Param("example") TchmNfmtapedefinitionExample example);

    
    int updateByPrimaryKeySelective(TchmNfmtapedefinition record);

    int updateByPrimaryKey(TchmNfmtapedefinition record);
}
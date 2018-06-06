package com.best1.api.mapper.scm;

import com.best1.api.entity.scm.supplier.TscmSupplierbusiness;
import com.best1.api.entity.scm.supplier.TscmSupplierbusinessExample;
import com.best1.api.entity.scm.supplier.TscmSupplierbusinessKey;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TscmSupplierbusinessMapper {
  
    int countByExample(TscmSupplierbusinessExample example);

   
    int deleteByExample(TscmSupplierbusinessExample example);

    
    int deleteByPrimaryKey(TscmSupplierbusinessKey key);

  
    int insert(TscmSupplierbusiness record);

 
    int insertSelective(TscmSupplierbusiness record);

   
    List<TscmSupplierbusiness> selectByExample(TscmSupplierbusinessExample example);

   
    TscmSupplierbusiness selectByPrimaryKey(TscmSupplierbusinessKey key);

  
    int updateByExampleSelective(@Param("record") TscmSupplierbusiness record, @Param("example") TscmSupplierbusinessExample example);

   
    int updateByExample(@Param("record") TscmSupplierbusiness record, @Param("example") TscmSupplierbusinessExample example);

    
    int updateByPrimaryKeySelective(TscmSupplierbusiness record);

  
    int updateByPrimaryKey(TscmSupplierbusiness record);
}
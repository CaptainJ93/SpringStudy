package com.best1.api.mapper.oaf.order;

import com.best1.api.entity.oaf.order.ToafPaybypost;
import com.best1.api.entity.oaf.order.ToafPaybypostExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface ToafPaybypostMapper {

    int countByExample(ToafPaybypostExample example);

    int insertSelective(ToafPaybypost record);

    List<ToafPaybypost> selectByExample(ToafPaybypostExample example);

 
    ToafPaybypost selectByPrimaryKey(Long paymentid);

  
    int updateByExampleSelective(@Param("record") ToafPaybypost record, @Param("example") ToafPaybypostExample example);


    int updateByPrimaryKeySelective(ToafPaybypost record);

}
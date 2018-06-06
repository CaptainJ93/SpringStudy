package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmContactcwccomments;
import com.best1.api.entity.crm.TcrmContactcwccommentsExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;
@SqlMapper
public interface TcrmContactcwccommentsMapper {

  
    int insertSelective(TcrmContactcwccomments record);

  
    List<TcrmContactcwccomments> selectByExample(TcrmContactcwccommentsExample example);

}
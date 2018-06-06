package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomermessagemarketing;
import com.best1.api.entity.crm.TcrmCustomermessagemarketingExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

@SqlMapper
public interface TcrmCustomermessagemarketingMapper {
   
    int countByExample(TcrmCustomermessagemarketingExample example);


    int deleteByExample(TcrmCustomermessagemarketingExample example);

    int deleteByPrimaryKey(Long marketingid);

  
   
    int insertSelective(TcrmCustomermessagemarketing record);

 
    List<TcrmCustomermessagemarketing> selectByExample(TcrmCustomermessagemarketingExample example);

    
    TcrmCustomermessagemarketing selectByPrimaryKey(Long marketingid);


    int updateByPrimaryKeySelective(TcrmCustomermessagemarketing record);

}
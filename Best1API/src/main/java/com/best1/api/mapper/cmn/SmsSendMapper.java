package com.best1.api.mapper.cmn;

import com.best1.api.entity.cmn.SmsSend;
import com.best1.api.entity.cmn.SmsSendExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

@SqlMapper
public interface SmsSendMapper {
public List<SmsSend> selectByExample(SmsSendExample example);

}
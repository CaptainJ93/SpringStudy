package com.best1.api.mapper.crm;


import com.best1.api.entity.crm.TcrmLotterybonus;
import com.best1.api.entity.crm.TcrmLotterybonusExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface TcrmLotterybonusMapper {

    int countByExample(TcrmLotterybonusExample example);

    int deleteByExample(TcrmLotterybonusExample example);

    int deleteByPrimaryKey(Long transactionid);

    int insert(TcrmLotterybonus record);

    int insertSelective(TcrmLotterybonus record);

    List<TcrmLotterybonus> selectByExample(TcrmLotterybonusExample example);

   
    TcrmLotterybonus selectByPrimaryKey(Long transactionid);


    int updateByExampleSelective(@Param("record") TcrmLotterybonus record, @Param("example") TcrmLotterybonusExample example);

    int updateByExample(@Param("record") TcrmLotterybonus record, @Param("example") TcrmLotterybonusExample example);

  
    int updateByPrimaryKeySelective(TcrmLotterybonus record);

  
    int updateByPrimaryKey(TcrmLotterybonus record);
}
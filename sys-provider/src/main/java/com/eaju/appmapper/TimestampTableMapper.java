package com.eaju.appmapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.TimestampTable;
import com.eaju.entity.TimestampTableExample;

public interface TimestampTableMapper {
    int countByExample(TimestampTableExample example);

    int deleteByExample(TimestampTableExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(TimestampTable record);

    int insertSelective(TimestampTable record);

    List<TimestampTable> selectByExample(TimestampTableExample example);

    TimestampTable selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") TimestampTable record, @Param("example") TimestampTableExample example);

    int updateByExample(@Param("record") TimestampTable record, @Param("example") TimestampTableExample example);

    int updateByPrimaryKeySelective(TimestampTable record);

    int updateByPrimaryKey(TimestampTable record);
}
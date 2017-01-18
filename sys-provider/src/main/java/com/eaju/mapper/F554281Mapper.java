package com.eaju.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.F554281;
import com.eaju.entity.F554281Example;
import com.eaju.entity.F554281Key;

public interface F554281Mapper {
    int countByExample(F554281Example example);

    int deleteByExample(F554281Example example);

    int deleteByPrimaryKey(F554281Key key);

    int insert(F554281 record);

    int insertSelective(F554281 record);

    List<F554281> selectByExample(F554281Example example);

    F554281 selectByPrimaryKey(F554281Key key);

    int updateByExampleSelective(@Param("record") F554281 record, @Param("example") F554281Example example);

    int updateByExample(@Param("record") F554281 record, @Param("example") F554281Example example);

    int updateByPrimaryKeySelective(F554281 record);

    int updateByPrimaryKey(F554281 record);
    
    List<F554281> test(String sovr01);
    
}
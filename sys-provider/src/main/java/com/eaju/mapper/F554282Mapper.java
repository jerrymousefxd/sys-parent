package com.eaju.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.F554282;
import com.eaju.entity.F554282Example;
import com.eaju.entity.F554282Key;

public interface F554282Mapper {
    int countByExample(F554282Example example);

    int deleteByExample(F554282Example example);

    int deleteByPrimaryKey(F554282Key key);

    int insert(F554282 record);

    int insertSelective(F554282 record);

    List<F554282> selectByExample(F554282Example example);

    F554282 selectByPrimaryKey(F554282Key key);

    int updateByExampleSelective(@Param("record") F554282 record, @Param("example") F554282Example example);

    int updateByExample(@Param("record") F554282 record, @Param("example") F554282Example example);

    int updateByPrimaryKeySelective(F554282 record);

    int updateByPrimaryKey(F554282 record);
    
}
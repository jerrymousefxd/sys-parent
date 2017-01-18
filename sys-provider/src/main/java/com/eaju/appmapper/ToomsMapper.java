package com.eaju.appmapper;

import com.eaju.entity.Tooms;
import com.eaju.entity.ToomsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToomsMapper {
    int countByExample(ToomsExample example);

    int deleteByExample(ToomsExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Tooms record);

    int insertSelective(Tooms record);

    List<Tooms> selectByExample(ToomsExample example);

    Tooms selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Tooms record, @Param("example") ToomsExample example);

    int updateByExample(@Param("record") Tooms record, @Param("example") ToomsExample example);

    int updateByPrimaryKeySelective(Tooms record);

    int updateByPrimaryKey(Tooms record);
    int insertToOms(@Param("orderSn")int orderSn,@Param("outOrderSn")String outOrderSn);
}
package com.eaju.appmapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.VoiceCall;
import com.eaju.entity.VoiceCallExample;

public interface VoiceCallMapper {
    int countByExample(VoiceCallExample example);

    int deleteByExample(VoiceCallExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(VoiceCall record);

    int insertSelective(VoiceCall record);

    List<VoiceCall> selectByExample(VoiceCallExample example);

    VoiceCall selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") VoiceCall record, @Param("example") VoiceCallExample example);

    int updateByExample(@Param("record") VoiceCall record, @Param("example") VoiceCallExample example);

    int updateByPrimaryKeySelective(VoiceCall record);

    int updateByPrimaryKey(VoiceCall record);
}
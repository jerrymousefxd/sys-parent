package com.eaju.appmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.eaju.entity.TbOrder;
@Repository
public interface TbOrderMapper {

    int insertTbOrder(TbOrder tbOrder);
    
    List<TbOrder> selectTbOrder(TbOrder tbOrder);
    
    List<TbOrder> selectTbOrderFBSByTime(@Param("beginTime")String beginTime,@Param("endTime")String endTime);
    
    int updateTbOrderByFid(String fid);
    
    int selectFbsByTbOrderFid(String fid);
}
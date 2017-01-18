package com.eaju.appmapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eaju.entity.TbOrderDetail;
@Repository
public interface TbOrderDetailMapper {

    int insertTbOrderDetail(TbOrderDetail detail);
    
    List<TbOrderDetail> findTbOrderDetailByOrderFid(String fid);

}
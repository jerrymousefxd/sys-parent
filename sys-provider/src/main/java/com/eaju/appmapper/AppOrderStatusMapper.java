package com.eaju.appmapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eaju.entity.AppOrderStatus;
import com.eaju.entity.TbOrder;
@Repository
public interface AppOrderStatusMapper {

    int insertAppOrderStatus(AppOrderStatus tbOrder);
    
    List<TbOrder> selectAppOrderStatus(AppOrderStatus tbOrder);
    
}
package com.reyco.dao;

import com.reyco.bean.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Reyco
 * @create 2019/6/15-14:19
 */
public interface ProductInfoRepository   extends JpaRepository<ProductInfo,String> {

    /*查看商家的状态*/
    List<ProductInfo> findByProductStatus(Integer productStatus);
}

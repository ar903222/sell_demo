package com.reyco.Service;

import com.reyco.bean.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Reyco
 * @create 2019/6/15-14:38
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /*查询所有在架商品列表*/
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}

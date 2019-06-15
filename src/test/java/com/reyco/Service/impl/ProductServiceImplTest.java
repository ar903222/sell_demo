package com.reyco.Service.impl;

import com.reyco.bean.ProductInfo;
import com.reyco.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Reyco
 * @create 2019/6/15-15:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("1");
        Assert.assertEquals("1",productInfo.getProductId());
        System.out.println(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = productService.findUpAll();
        Assert.assertNotEquals(0,upAll);
    }

    @Test
    public void findAll() {
        Page<ProductInfo> all = productService.findAll(new PageRequest(0,2));
        System.out.println(all.getTotalElements());

    }

    @Test
    public void save() {
        ProductInfo info = new ProductInfo();
        info.setProductId("2");
        info.setProductName("干炒牛河");
        info.setProductPrice(new BigDecimal(12.5));
        info.setProductStock(100);
        info.setProductDescription("牛肉十足");
        info.setProductIcon("http://alibaba.com");
        info.setProductStatus(ProductStatusEnum.DOWN.getCode());
        info.setCategoryType(2);

        ProductInfo productInfo = productService.save(info);
        Assert.assertNotNull(productInfo);
    }
}
package com.reyco.dao;

import com.reyco.bean.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Reyco
 * @create 2019/6/15-14:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void test(){
        ProductInfo info = new ProductInfo();
        info.setProductId("1");
        info.setProductName("豆浆油条");
        info.setProductPrice(new BigDecimal(3.2));
        info.setProductStock(100);
        info.setProductDescription("正宗植物豆子");
        info.setProductIcon("http://baidu.com");
        info.setProductStatus(0);
        info.setCategoryType(2);

        ProductInfo productInfo = productInfoRepository.save(info);
        Assert.assertNotNull(productInfo);;

    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productStatus = productInfoRepository.findByProductStatus(0);
        System.out.println(productStatus);
        Assert.assertNotEquals(0,productStatus);
    }
}
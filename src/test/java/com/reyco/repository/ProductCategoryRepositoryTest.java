package com.reyco.repository;

import com.reyco.dao.ProductCategoryRepository;
import com.reyco.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * @author Reyco
 * @create 2019/6/15-9:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;
    

    @Test
    @Transactional
    public void updateTest(){
        ProductCategory productCategory = new ProductCategory("文学类", 7);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1, 2, 3);

        List<ProductCategory> list1 = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,list1.size());

    }
}
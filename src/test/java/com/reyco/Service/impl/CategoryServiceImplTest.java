package com.reyco.Service.impl;

import com.reyco.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Reyco
 * @create 2019/6/15-13:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception{
        ProductCategory productCategory = categoryService.findOne(1);
        System.out.println(productCategory);
        System.out.println("===================================================");
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> categoryList = categoryService.findAll();
        System.out.println(categoryList);
        System.out.println("===================================================");
        Assert.assertNotEquals(0,categoryList.size());

    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> categoryTypeIn = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,5,6,7));
        System.out.println(categoryTypeIn);
        Assert.assertNotEquals(0,categoryTypeIn.size());

    }

    @Test
    public void save() {
        ProductCategory category = new ProductCategory("恐怖类", 5);
        ProductCategory result = categoryService.save(category);
        Assert.assertNotNull(result);
        System.out.println(result);
    }
}
package com.reyco.Service;

import com.reyco.bean.ProductCategory;

import java.util.List;

/**
 * @author Reyco
 * @create 2019/6/15-11:50
 */
public interface CategoryService {


    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

package com.smile24es.ts_project.service;

import com.smile24es.ts_project.beans.Product;

import java.util.List;

public interface SubCategoryProductService {

    List<Product> findAllProductBySubCategory(int subCategoryID);

}

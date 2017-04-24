package com.smile24es.ts_project.dao;

import com.smile24es.ts_project.beans.SubCategoryProduct;

import java.util.List;

public interface SubCategoryProductDao {

    List<SubCategoryProduct> findAllProductBySubCategory(int subCategoryID);

   
}

package com.smile24es.ts_project.dao;

import com.smile24es.ts_project.beans.SubCategory;

import java.util.List;

public interface SubCategoryDao {

    List<SubCategory> findAllSubCategory();

    SubCategory findSubCategoryById(int id);
    
     List<SubCategory> findAllSubCategoryByMainCategoryID(int mainCategoryID);
}

package com.smile24es.ts_project.service;

import com.smile24es.ts_project.beans.SubCategory;

import java.util.List;

public interface SubCategoryService {

    List<SubCategory> findAllSubCategory();

    SubCategory findSubCategoryById(int id);
    
    List<SubCategory> findAllSubCategoryByMainCategoryID(int mainCategoryID);

}

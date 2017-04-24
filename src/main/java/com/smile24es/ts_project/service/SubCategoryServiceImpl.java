package com.smile24es.ts_project.service;


import com.smile24es.ts_project.beans.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.smile24es.ts_project.dao.SubCategoryDao;

@Service("subCategoryService")
@Transactional
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryDao dao;

    @Override
    public List<SubCategory> findAllSubCategory() {
        return dao.findAllSubCategory();
    }

    @Override
    public SubCategory findSubCategoryById(int id) {
        return dao.findSubCategoryById(id);
    }

    @Override
    public List<SubCategory> findAllSubCategoryByMainCategoryID(int mainCategoryID) {
        return dao.findAllSubCategoryByMainCategoryID(mainCategoryID);
    }


}

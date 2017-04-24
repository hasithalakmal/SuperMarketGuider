package com.smile24es.ts_project.service;


import com.smile24es.ts_project.beans.MainCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.smile24es.ts_project.dao.MainCategoryDao;

@Service("mainCategoryService")
@Transactional
public class MainCategoryServiceImpl implements MainCategoryService {

    @Autowired
    private MainCategoryDao dao;

    @Override
    public List<MainCategory> findAllMainCategory() {
        return dao.findAllMainCategory();
    }


}

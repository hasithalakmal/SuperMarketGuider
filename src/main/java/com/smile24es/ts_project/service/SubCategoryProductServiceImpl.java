package com.smile24es.ts_project.service;


import com.smile24es.ts_project.beans.Product;
import com.smile24es.ts_project.beans.SubCategoryProduct;
import com.smile24es.ts_project.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.smile24es.ts_project.dao.SubCategoryProductDao;
import java.util.ArrayList;

@Service("subCategoryProductService")
@Transactional
public class SubCategoryProductServiceImpl implements SubCategoryProductService {

    @Autowired
    private SubCategoryProductDao dao;
    
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAllProductBySubCategory(int subCategoryID) {
        List<SubCategoryProduct> subCategoryProductList = dao.findAllProductBySubCategory(subCategoryID);
        List<Product> productList = new ArrayList<>();
        subCategoryProductList.stream().map((subCategoryProduct) -> subCategoryProduct.getSubCategoryProductPK().getProductId()).map((productId) -> productDao.findProductByID(productId)).forEachOrdered((product) -> {
            productList.add(product);
        });
        
        return productList;
    }

   


}

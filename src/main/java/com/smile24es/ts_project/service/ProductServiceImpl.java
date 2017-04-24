package com.smile24es.ts_project.service;


import com.smile24es.ts_project.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.smile24es.ts_project.dao.ProductDao;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao dao;

    @Override
    public List<Product> findAllProduct() {
        return dao.findAllProduct();
    }

    @Override
    public Product findProductByID(int productId) {
        return dao.findProductByID(productId);
    }


}

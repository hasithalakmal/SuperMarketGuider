package com.smile24es.ts_project.dao;

import com.smile24es.ts_project.beans.Product;

import java.util.List;

public interface ProductDao {

    List<Product> findAllProduct();

    Product findProductByID(int productId);
}

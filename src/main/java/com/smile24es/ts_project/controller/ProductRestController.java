/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smile24es.ts_project.controller;


import com.smile24es.ts_project.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.json.JSONObject;
import com.smile24es.ts_project.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Hasitha Lakmal
 */
@RestController
@Component
public class ProductRestController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "products", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllProducts() {
        List<Product> attendance = productService.findAllProduct();
        JSONObject responce = new JSONObject();
        responce.accumulate("state", "success");
        responce.accumulate("error", false);
        responce.accumulate("msg", "success");
        responce.accumulate("result", attendance);
        return new ResponseEntity<>(responce.toString(), HttpStatus.OK);
    }


     @RequestMapping(value = "products/{productId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Product> getAllSubCategories(@PathVariable int productId) {
        Product attendance = productService.findProductByID(productId);
        return new ResponseEntity<>(attendance, HttpStatus.OK);
    }
}

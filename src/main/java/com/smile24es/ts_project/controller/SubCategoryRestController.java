/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smile24es.ts_project.controller;


import com.smile24es.ts_project.beans.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.json.JSONObject;
import com.smile24es.ts_project.service.SubCategoryService;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Hasitha Lakmal
 */
@RestController
@Component
public class SubCategoryRestController {

    @Autowired
    SubCategoryService subCategoryService;

    @RequestMapping(value = "sub-categories", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllSubCategories() {
        List<SubCategory> categories = subCategoryService.findAllSubCategory();
        JSONObject responce = new JSONObject();
        responce.accumulate("state", "success");
        responce.accumulate("error", false);
        responce.accumulate("msg", "success");
        responce.accumulate("result", categories);
        return new ResponseEntity<>(responce.toString(), HttpStatus.OK);
    }


    @RequestMapping(value = "sub-categories/{subCategoryId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<SubCategory> getAllSubCategories(@PathVariable int subCategoryId) {
        SubCategory attendance = subCategoryService.findSubCategoryById(subCategoryId);
//        JSONObject responce = new JSONObject();
//        responce.accumulate("state", "success");
//        responce.accumulate("error", false);
//        responce.accumulate("msg", "success");
//        responce.accumulate("result", attendance);
        return new ResponseEntity<>(attendance, HttpStatus.OK);
    }
    
    @RequestMapping(value = "sub-categories-by-main-category/{mainCategoryId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllSubCategoriesByMainCategoryID(@PathVariable int mainCategoryId) {
        List<SubCategory> categories = subCategoryService.findAllSubCategoryByMainCategoryID(mainCategoryId);
        JSONObject responce = new JSONObject();
        responce.accumulate("state", "success");
        responce.accumulate("error", false);
        responce.accumulate("msg", "success");
        responce.accumulate("result", categories);
        return new ResponseEntity<>(responce.toString(), HttpStatus.OK);
    }
}

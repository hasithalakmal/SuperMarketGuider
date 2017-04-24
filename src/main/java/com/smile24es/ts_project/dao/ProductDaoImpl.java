package com.smile24es.ts_project.dao;


import com.smile24es.ts_project.beans.Product;
import com.smile24es.ts_project.utill.TS_ProjectApiException;
import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.smile24es.ts_project.utill.ErrorCode.UNEXPECTED_ERROR;

@Repository("productDao")
public class ProductDaoImpl extends AbstractDao<Integer, Product> implements ProductDao {



    private static final Logger SL4J_LOGGER = LoggerFactory.getLogger(ProductDaoImpl.class);

    @Override
    public List<Product> findAllProduct() {
        Criteria criteria = createEntityCriteria();
        return (List<Product>) criteria.list();
    }

    public String testMethod(int num) {
        SL4J_LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if(num != 0){
            return "Working "+num;
        }else{
            throw new TS_ProjectApiException(HttpStatus.BAD_REQUEST,UNEXPECTED_ERROR, "xxxxx");
        }
    }

    @Override
    public Product findProductByID(int productId) {
        return getByKey(productId);
    }


}

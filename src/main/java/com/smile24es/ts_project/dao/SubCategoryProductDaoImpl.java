package com.smile24es.ts_project.dao;


import com.smile24es.ts_project.beans.SubCategoryProduct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


@Repository("subCategoryProductDao")
public class SubCategoryProductDaoImpl extends AbstractDao<Integer, SubCategoryProduct> implements SubCategoryProductDao {

    private static final Logger SL4J_LOGGER = LoggerFactory.getLogger(SubCategoryProductDaoImpl.class);

    @Override
    public List<SubCategoryProduct> findAllProductBySubCategory(int subCategoryID) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("subCategoryProductPK.subCategoryId", subCategoryID));
        return (List<SubCategoryProduct>) criteria.list();
    }

    

   

}

package com.smile24es.ts_project.dao;

import com.smile24es.ts_project.beans.MainCategory;
import com.smile24es.ts_project.beans.SubCategory;
import com.smile24es.ts_project.utill.TS_ProjectApiException;
import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.smile24es.ts_project.utill.ErrorCode.UNEXPECTED_ERROR;
import org.hibernate.criterion.Restrictions;

@Repository("subCategoryDao")
public class SubCategoryDaoImpl extends AbstractDao<Integer, SubCategory> implements SubCategoryDao {

    private static final Logger SL4J_LOGGER = LoggerFactory.getLogger(SubCategoryDaoImpl.class);

    @Override
    public List<SubCategory> findAllSubCategory() {
        Criteria criteria = createEntityCriteria();
        return (List<SubCategory>) criteria.list();
    }

    @Override
    public SubCategory findSubCategoryById(int id) {
        return getByKey(id);
    }

    public String testMethod(int num) {
        SL4J_LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if (num != 0) {
            return "Working " + num;
        } else {
            throw new TS_ProjectApiException(HttpStatus.BAD_REQUEST, UNEXPECTED_ERROR, "xxxxx");
        }
    }

    @Override
    public List<SubCategory> findAllSubCategoryByMainCategoryID(int mainCategoryID) {
        MainCategory mc = new MainCategory();
        mc.setMainCategoryId(mainCategoryID);
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("mainCategoryId", mc));
        return (List<SubCategory>) criteria.list();
    }

}

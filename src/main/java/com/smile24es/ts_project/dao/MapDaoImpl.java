package com.smile24es.ts_project.dao;


import com.smile24es.ts_project.beans.Map;
import com.smile24es.ts_project.utill.TS_ProjectApiException;
import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.smile24es.ts_project.utill.ErrorCode.UNEXPECTED_ERROR;

@Repository("mapDao")
public class MapDaoImpl extends AbstractDao<Integer, Map> implements MapDao {



    private static final Logger SL4J_LOGGER = LoggerFactory.getLogger(MapDaoImpl.class);

    @Override
    public List<Map> findAllmap() {
        Criteria criteria = createEntityCriteria();
        return (List<Map>) criteria.list();
    }

    public String testMethod(int num) {
        SL4J_LOGGER.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        if(num != 0){
            return "Working "+num;
        }else{
            throw new TS_ProjectApiException(HttpStatus.BAD_REQUEST,UNEXPECTED_ERROR, "xxxxx");
        }
    }


}

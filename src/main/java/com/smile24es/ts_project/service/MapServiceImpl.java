package com.smile24es.ts_project.service;


import com.smile24es.ts_project.beans.Map;
import com.smile24es.ts_project.dao.MapDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("mapService")
@Transactional
public class MapServiceImpl implements MapService {

    @Autowired
    private MapDao dao;

    @Override
    public List<Map> findAllMap() {
        return dao.findAllmap();
    }


}

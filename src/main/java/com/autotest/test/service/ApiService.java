package com.autotest.test.service;

import com.autotest.test.dao.ApiMapper;
import com.autotest.test.entity.ApiEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
//    Mapper
    @Autowired
    public ApiMapper apiMapper;

    public ApiEntity qureyId(int id){
        return apiMapper.queryId(id);
    }

    public ApiEntity queryName(String name){
        System.out.println(name);
        return apiMapper.queryName(name);
    }
}

package com.autotest.test.service;

import com.autotest.test.dao.ApiMapper;
import com.autotest.test.dao.ScenarioVariable;
import com.autotest.test.entity.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {
//    Mapper
    @Autowired
    public ApiMapper apiMapper;

    public Api qureyApi(int id){
        return apiMapper.queryApi(id);
    }


}

package com.autotest.test.service;

import com.autotest.test.dao.ApiMapper;
import com.autotest.test.entity.ApiEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    public ApiMapper apiMapper;

    public ApiEntity qureyId(int id) {
        return apiMapper.queryId(id);
    }

    public ApiEntity queryName(String name) {
        return apiMapper.queryName(name);
    }

    public List queryCompose(String url, String requestMethod) {
        return apiMapper.queryCompose(url, requestMethod);
    }

    public List<ApiEntity> queryPage() {
        return apiMapper.queryPage();
    }

    public int saveInfo(int app, String name, String describer, String url, String requestMethod, String contentType, String header, String param){
        return apiMapper.saveInfo(app,name,describer,url,requestMethod,contentType,header,param);
    }

    public int deleteInfo(int id,int app,String name){
        return apiMapper.deleteInfo(id,app,name);
    }

}


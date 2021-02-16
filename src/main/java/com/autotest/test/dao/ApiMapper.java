package com.autotest.test.dao;

import com.autotest.test.entity.ApiEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiMapper {

    ApiEntity queryId(int id);
    ApiEntity queryName(String name);
    List queryCompose(String url,String requestMethod );
    List<ApiEntity> queryPage();
    int saveInfo(Map data);
    //int deleteInfo(int id,int app,String name);
    int deleteInfo(List id);
    int deleteById(Object id);
    int updateInfo(Map map);

    List<ApiEntity> queryApis(ApiEntity apiEntity);

}

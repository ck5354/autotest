package com.autotest.test.dao;

import com.autotest.test.entity.ApiEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface ApiMapper {

    ApiEntity queryId(int id);
    ApiEntity queryName(String name);
    List queryCompose(String url,String requestMethod );

    List<ApiEntity> queryPage();

    int saveApi(ApiEntity apiEntity);
    int deleteApi(int id);
    int updateApi(ApiEntity apiEntity);
    List<ApiEntity> queryApis(ApiEntity apiEntity);

}

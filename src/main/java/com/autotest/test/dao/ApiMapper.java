package com.autotest.test.dao;

import com.autotest.test.entity.ApiEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApiMapper {

    ApiEntity queryId(int id);

    ApiEntity queryName(String name);
    List queryCompose(String url,String requestMethod );
    List<ApiEntity> queryPage();
    int saveInfo(int app, String name, String describer, String url, String requestMethod, String contentType, String header, String param );
    int deleteInfo(int id,int app,String name);

    int saveApi(ApiEntity apiEntity);

    int deleteApi(int id);

    int updateApi(ApiEntity apiEntity);

    List<ApiEntity> queryApis(ApiEntity apiEntity);

}

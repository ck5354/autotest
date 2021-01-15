package com.autotest.test.dao;

import com.autotest.test.entity.ApiEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApiMapper {

    ApiEntity queryApi(int id);

    int saveApi(ApiEntity apiEntity);

    int deleteApi(int id);

    int updateApi(ApiEntity apiEntity);

    List<ApiEntity> queryApis(ApiEntity apiEntity);

}

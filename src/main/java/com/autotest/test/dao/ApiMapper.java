package com.autotest.test.dao;

import com.autotest.test.entity.Api;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApiMapper {

    Api queryApi(int id);

    int saveApi(Api api);

    int deleteApi(int id);

    int updateApi(Api api);

    List<Api> queryApis(Api api);

}

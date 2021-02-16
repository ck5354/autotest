package com.autotest.test.service;

import com.autotest.test.dao.ApiMapper;
import com.autotest.test.entity.ApiEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public List<ApiEntity> queryPage(int pageNum, int  pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ApiEntity> apiEntityList = apiMapper.queryPage();
        for (ApiEntity apiEntity : apiEntityList) {
            System.out.println("element : " + apiEntity);
        }
        // 封装分页查询结果到 PageInfo 对象中以获取相关分页信息
        PageInfo pageInfo = new PageInfo(apiEntityList);
        System.out.println("----------"+pageInfo.getPages());
        if (pageNum > pageInfo.getPages()) {
            System.out.println("超出页码范围");
            return null;
        } else {
            System.out.println("总页数: " + pageInfo.getPages());
            System.out.println("总记录数: " + pageInfo.getTotal());
            System.out.println("当前页数: " + pageInfo.getPageNum());
            System.out.println("当前页面记录数量: " + pageInfo.getSize());
            return apiEntityList;
        }
    }

    public int saveInfo(Map<String, Object> data){
        for(Map.Entry entry:data.entrySet()){
            System.out.println("saveInfo接口__"+entry.getKey()+" -> "+entry.getValue());
        }
        int rows = apiMapper.saveInfo(data);
        if(rows > 0){
            System.out.println("保存"+rows+"条数据");
        }else if(apiMapper.saveInfo(data) == 0){
            System.out.println("保存"+rows+"条数据");
        }else{
            System.out.println("保存异常");
        }
        return rows;
    }

    public int deleteInfo(List id){//通过foreach方式删除
        int rows = apiMapper.deleteInfo(id);
        if(rows > 0) {
            System.out.println("删除"+rows+"条数据");
        }else if(rows == 0){
            System.out.println("未有要删除的数据");
        }else{
            System.out.println("删除异常");
        }
        return rows;
    }

    public String deleteById(List id){//通过id删除
        int count = 0;
        for(int i=0;i<id.size();i++){
            int rows = apiMapper.deleteById(id.get(i));
            if(rows > 0) {
                count += rows;
                System.out.println("删除[id："+id.get(i)+"]的数据");
            }else if(rows == 0){
                System.out.println("未有[id："+id.get(i)+"]的数据");
            }else{
                System.out.println("未有要删除的数据");
            }
        }
        return "共删除"+count+"条数据";
    }

    public int updateInfo(Map<String,Object> newInfo){
        for(Map.Entry entry : newInfo.entrySet()){
            System.out.println("key:"+entry.getKey()+" -> "+"value:"+entry.getValue());
        }
        return apiMapper.updateInfo(newInfo);
    }


}


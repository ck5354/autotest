package com.autotest.test.controller;


import com.autotest.test.entity.ApiEntity;
import com.autotest.test.entity.SysResult;
import com.autotest.test.service.ApiService;
import com.autotest.test.service.VariableService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("api")
@RestController
public class ApiController {


    @Autowired
    ApiService apiService;


    @RequestMapping("/queryId/{id}")
    @ResponseBody
    public ApiEntity queryId(@PathVariable(name = "id") int id) {
        return apiService.qureyId(id);
    }

    @RequestMapping("/queryName/{name}")
    @ResponseBody
    public ApiEntity queryName(@PathVariable(name = "name") String name) {
        return apiService.queryName(name);
    }

    @RequestMapping("/queryCompose")
    @ResponseBody
    public List queryCompose(@RequestParam(name = "url") String url, @RequestParam(name = "requestMethod") String requestMethod) {
        return apiService.queryCompose(url, requestMethod);
    }

    @ResponseBody
    @RequestMapping("/queryPage")
    public List<ApiEntity> queryPage(@RequestParam int pageNum, @RequestParam int pageSize) {
        // 设置分页查询参数
        PageHelper.startPage(pageNum, pageSize);
        List<ApiEntity> apiEntityList = apiService.queryPage();

        for (ApiEntity apiEntity : apiEntityList) {
            System.out.println("element : " + apiEntity);
        }

        // 封装分页查询结果到 PageInfo 对象中以获取相关分页信息
        PageInfo pageInfo = new PageInfo(apiEntityList);
        if (pageNum > pageInfo.getPages()){
            System.out.println("超出页码范围");
            return null;
        }else {
            System.out.println("总页数: " + pageInfo.getPages());
            System.out.println("总记录数: " + pageInfo.getTotal());
            System.out.println("当前页数: " + pageInfo.getPageNum());
            System.out.println("当前页面记录数量: " + pageInfo.getSize());
            return pageInfo.getList();
        }
    }
}

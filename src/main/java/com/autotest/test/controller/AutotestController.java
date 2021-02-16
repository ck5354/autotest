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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("Api")
@RestController
public class AutotestController {
    @Autowired
    ApiService apiService;

    /*↓↓↓↓ @项目相关 ↓↓↓↓↓*/
    @GetMapping("/queryId/{id}")
    @ResponseBody
    public ApiEntity queryId(@PathVariable(name = "id")int id) {
        return apiService.qureyId(id);
    }

    @GetMapping("/queryName/{name}")
    @ResponseBody
    public ApiEntity queryName(@PathVariable(name = "name")String name) {
        return apiService.queryName(name);
    }

    @GetMapping("/queryCompose")
    @ResponseBody
    public List queryCompose(@RequestParam(name = "url")String url, @RequestParam(name = "requestMethod")String requestMethod) {
        return apiService.queryCompose(url,requestMethod);
    }

    @GetMapping("/queryPage")
    @ResponseBody
    public List<ApiEntity> queryPage(@RequestParam int pageNum, @RequestParam int pageSize) {
        return apiService.queryPage(pageNum,pageSize);
    }

    @PostMapping("/saveInfo")
    @ResponseBody
    public String saveInfo(@RequestBody Map<String,Object> saveData) {
        return "保存"+apiService.saveInfo(saveData)+"条数据成功";
    }


    @GetMapping("/deleteInfo")
    @ResponseBody
    public String deleteInfo(@RequestParam(name = "id")List id) {
        return "删除"+apiService.deleteInfo(id)+"条数据成功";
    }

    @GetMapping("/deleteById")
    @ResponseBody
    public String deleteById(@RequestParam(name = "id")List id) {
        return apiService.deleteById(id);
    }


    @PostMapping("/updateInfo")
    @ResponseBody
    public String updateById(@RequestBody Map<String,Object> dataMap){
        return "更新"+apiService.updateInfo(dataMap)+"条数据成功";
    }
}
package com.autotest.test.controller;


import com.autotest.test.entity.ApiEntity;
import com.autotest.test.entity.SysResult;
import com.autotest.test.service.ApiService;
import com.autotest.test.service.VariableService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("Api")
@RestController
public class AutotestController {
    @RequestMapping("/index")
    public String home() {
        return "index.html";
    }

    @RequestMapping("/run")
    public String autoRun(HttpServletRequest request) {
        return "请输入正确的账户名密码";
    }

    @Autowired
    VariableService variableService;

    @Autowired
    ApiService apiService;

    @RequestMapping("/getSelect")
    @ResponseBody
    public SysResult getJsonResult2() {
        return SysResult.ok(variableService.getJsonResult(2));
    }

    @RequestMapping("/getInsert")
    @ResponseBody
    public SysResult queryInsert(){
        return SysResult.ok(variableService.getInsertResult());
    }

    @RequestMapping("/getDelete")
    @ResponseBody
    public SysResult queryDelete(){
        return SysResult.ok(variableService.getDeleteResult());
    }

    /*↓↓↓↓ @项目相关 ↓↓↓↓↓*/
    @RequestMapping("/queryId/{id}")
    @ResponseBody
    public ApiEntity queryId(@PathVariable(name = "id")int id) {
        return apiService.qureyId(id);
    }

    @RequestMapping("/queryName/{name}")
    @ResponseBody
    public ApiEntity queryName(@PathVariable(name = "name")String name) {
        return apiService.queryName(name);
    }

    @RequestMapping("/queryCompose")
    @ResponseBody
    public List queryCompose(@RequestParam(name = "url")String url, @RequestParam(name = "requestMethod")String requestMethod) {
        return apiService.queryCompose(url,requestMethod);
    }

}

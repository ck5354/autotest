package com.autotest.test.controller;


import com.autotest.test.entity.ApiEntity;
import com.autotest.test.entity.SysResult;
import com.autotest.test.service.ApiService;
import com.autotest.test.service.VariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


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
    @RequestMapping("/query/id")
    @ResponseBody
    public ApiEntity queryId() {
        return apiService.qureyId(1);
    }

    @RequestMapping("/query/name")
    @ResponseBody
    public ApiEntity queryName() {
        return apiService.queryName("1");
    }

}

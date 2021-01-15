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
    @RequestMapping("/hello")
    public String home() {
        return "hello1";
    }

    @RequestMapping("/run")
    public String autoRun(HttpServletRequest request) {
        return "hello world!";
    }

    @Autowired
    VariableService variableService;

    @Autowired
    ApiService apiService;

    @RequestMapping("/getSelect")
    @ResponseBody
    public SysResult getJsonResult() {
        return SysResult.ok(variableService.getJsonResult());
    }

    @RequestMapping("/query/api")
    @ResponseBody
    public ApiEntity queryApi() {
        return apiService.qureyApi(1);
    }

}

package com.autotest.test.controller;



import com.autotest.test.entity.SysResult;
import com.autotest.test.service.VariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @Autowired
    VariableService variableService;

    @RequestMapping("/index")
    public String home() {
        return "index.html";
    }

    @RequestMapping("/run")
    public String autoRun(HttpServletRequest request) {
        return "请输入正确的账户名密码";
    }

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

}

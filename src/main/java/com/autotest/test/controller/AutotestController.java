package com.autotest.test.controller;


import com.autotest.test.entity.SysResult;
import com.autotest.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
public class AutotestController {
    @RequestMapping("/hello")
    public String home() {
        return "hello";
    }

    @RequestMapping("/run")
    public String autoRun(HttpServletRequest request) {
        return "hello world!";
    }

    @Autowired
    UserService userService;

    @RequestMapping("/getSelect")
    @ResponseBody
    public SysResult getJsonResult(){
        return SysResult.ok(userService.getJsonResult());
    }

}

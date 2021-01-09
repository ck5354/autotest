package com.autotest.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

/**
 * @className: AutotestController
 * @description: <一句话功能简述>
 * @author: chenkuo9
 * @date: 2019/7/9
 */

@RestController
public class AutotestController {
    @RequestMapping("/hello")
    public String home() {
        return "hello";
    }

    @RequestMapping("/run")
    public String autoRun(HttpServletRequest request) {

        return "hello word!";
    }

}

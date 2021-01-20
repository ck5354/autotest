package com.autotest.test.service;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {
    /**
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String mackUrl = "/mock";
        if(mackUrl.equals(((HttpServletRequest)request).getRequestURI())){
            //如果需要mock，从数据库中获取mock结果
            System.out.println("");
            response.setCharacterEncoding("GBK");
            response.getWriter().println("这个是 mock 接口");
        }else {
            //如果不是mock，需要http client转发
            response.setCharacterEncoding("GBK");
            response.getWriter().println("这个是 跳转 接口");
        }

//        chain.doFilter(request,response);

    }
}

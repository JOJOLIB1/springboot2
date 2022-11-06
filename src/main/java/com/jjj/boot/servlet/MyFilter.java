package com.jjj.boot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @className: com.jjj.boot.servlet.MyFilter
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-06 9:16
 */
@WebFilter("/abc")
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("{}", "顺利执行MyFilter");
        chain.doFilter(request, response);
    }
}

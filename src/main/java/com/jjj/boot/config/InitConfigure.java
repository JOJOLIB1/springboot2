package com.jjj.boot.config;

import com.jjj.boot.servlet.MyFilter;
import com.jjj.boot.servlet.MyListener;
import com.jjj.boot.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @className: com.jjj.boot.config.InitConfigure
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-06 9:08
 */
//@ServletComponentScan("com.jjj.boot.servlet")
@Configuration
public class InitConfigure {
//    @Bean
    public ServletRegistrationBean<MyServlet> servletServletRegistrationBean() {
        return new ServletRegistrationBean<>(new MyServlet(), "/abc");
    }
//    @Bean
    public FilterRegistrationBean<MyFilter> filterFilterRegistrationBean() {
        return new FilterRegistrationBean<>(new MyFilter(), servletServletRegistrationBean());
    }
//    @Bean
    public ServletListenerRegistrationBean<MyListener> listenerServletListenerRegistrationBean() {
        return new ServletListenerRegistrationBean<>(new MyListener());
    }




}

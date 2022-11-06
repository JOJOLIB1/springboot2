package com.jjj.boot.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @className: com.jjj.boot.servlet.MyLintener
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-06 9:17
 */
@WebListener
@Slf4j
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("{}", "监听器初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}

package com.jjj.boot.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: com.jjj.boot.servlet.MyServlet
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-06 9:06
 */
@WebServlet("/abc")
@Slf4j
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("{}", "顺利执行MyServlet");
    }
}

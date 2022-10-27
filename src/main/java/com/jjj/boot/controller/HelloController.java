package com.jjj.boot.controller;

import com.jjj.boot.pojo.Customer;
import com.jjj.boot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.jjj.boot.controller.HelloController
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-26 21:41
 */
@RestController
public class HelloController {
    @Autowired
    User user;

    @Autowired
    Customer customer;

    @RequestMapping("/hello")
    public String toHello() {
        return "Hello SpringBoot2!" + user + customer;
    }
}

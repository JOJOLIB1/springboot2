package com.jjj.boot.controller;

import com.jjj.boot.pojo.Customer;
import com.jjj.boot.pojo.Person;
import com.jjj.boot.pojo.Pet;
import com.jjj.boot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Autowired
    Pet pet;
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String toHello(@RequestParam("name") String name) {
        return "Hello SpringBoot2!" + user + customer + name + "==";
    }

    @RequestMapping("/testYaml")
    public String testYaml() {
        return person + "" + pet ;
    }
}

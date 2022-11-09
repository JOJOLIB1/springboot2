package com.jjj.boot.controller;

import com.hello.service.HelloService;
import com.jjj.boot.pojo.Customer;
import com.jjj.boot.pojo.Person;
import com.jjj.boot.pojo.Pet;
import com.jjj.boot.pojo.User;
import com.jjj.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    HelloService helloService;

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String toHello(@RequestParam("name") String name) {
        return "Hello SpringBoot2!" + user + customer + name + "==";
    }

    @RequestMapping("/testYaml")
    public String testYaml() {
        return person + "" + pet ;
    }

    @GetMapping("/select")
    public Object select() {
        return userService.queryAllUser();
    }
    @GetMapping("/selectOne")
    public Object selectOne() {
        return userService.queryOne();
    }

    @GetMapping("/sayHello")
    public Object say() {
        return helloService.sayHello();
    }
}

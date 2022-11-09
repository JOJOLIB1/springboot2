package com.jjj.boot;

import com.jjj.boot.pojo.Customer;
import com.jjj.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @className: com.jjj.boot.MainApple
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-26 21:39
 */
@SpringBootApplication
public class MainApplet {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplet.class, args);
        for (String bean : ioc.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
//        System.out.println(ioc.containsBean("user1"));
//        System.out.println(ioc.getBean("user0", User.class).getCustomer() == ioc.getBean("customer", Customer.class));
    }
}

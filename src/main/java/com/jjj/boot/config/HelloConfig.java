package com.jjj.boot.config;

import com.jjj.boot.pojo.Customer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
/**
 * @className: com.jjj.boot.controller.config.HelloConfig
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-26 21:58
 */
@Configuration(proxyBeanMethods = true)
//@Import({String.class, StringBuffer.class})
//@ImportResource("classpath:bean.xml")
//@ConditionalOnBean(name = "customer")
@EnableConfigurationProperties(Customer.class)
public class HelloConfig {
/*    @Bean
    public User user0() {
        return new User("zs", "张三", customer());
    }

    @Bean
    public Customer customer() {
        return new Customer("ls", "李四");
    }*/
}


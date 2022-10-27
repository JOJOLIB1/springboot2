package com.jjj.boot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @className: com.jjj.boot.pojo.User
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-26 21:59
 */
@Component
@ConfigurationProperties("user")
public class User {
    private String uid;
    private String uname;

    private Customer customer;

    public User(String uid, String uname, Customer customer) {
        this.uid = uid;
        this.uname = uname;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", customer=" + customer +
                '}';
    }
}

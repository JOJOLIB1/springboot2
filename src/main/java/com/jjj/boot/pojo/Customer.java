package com.jjj.boot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @className: com.jjj.boot.pojo.Customer
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-26 21:59
 */
@ConfigurationProperties("customer")
public class Customer {
    private String cid;
    private String cname;

    public Customer(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Customer() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}

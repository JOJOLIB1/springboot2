package com.jjj.boot.endponit;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * @className: com.jjj.boot.endponit.MyEndPoint
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-08 11:04
 */
@Endpoint(id = "myId")
@Component
public class MyEndPoint {
    @WriteOperation
    public void write() {
        System.out.println("write");
    }
    @ReadOperation
    public Map<String, String> read() {
        return Collections.singletonMap("info","docker started...");
    }
}



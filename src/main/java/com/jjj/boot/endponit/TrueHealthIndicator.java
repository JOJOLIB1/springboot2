package com.jjj.boot.endponit;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @className: com.jjj.boot.endponit.TrueHealthIndicator
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-08 10:31
 */
@Component
public class TrueHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        HashMap<String, String> hashMap = new HashMap<>();
        builder.up();
        hashMap.put("健康状况", "非常健康");
        builder.withDetails(hashMap).withDetail("异常状况", "无异常");
    }
}

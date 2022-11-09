package com.jjj.boot.endponit;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

/**
 * @className: com.jjj.boot.endponit.MyMetrics
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-08 10:39
 */
@Component
public class MyMetrics {
    Counter my_service_runner;
    public MyMetrics(MeterRegistry registry) {
        my_service_runner = registry.counter("hello.count");
    }

    public void hello() {
        my_service_runner.increment();;
    }
}

package com.jjj.boot.endponit;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * @className: com.jjj.boot.endponit.MyContributor
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-08 10:38
 */
@Component
public class MyContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("信息", "乱写的");
    }
}

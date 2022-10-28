package com.jjj.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @className: com.jjj.boot.pojo.Pet
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-28 22:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "pet")
@Component
public class Pet {
    private String name;
    private Double weight;
}

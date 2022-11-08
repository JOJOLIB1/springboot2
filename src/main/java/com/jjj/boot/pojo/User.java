package com.jjj.boot.pojo;

import lombok.*;
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

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private String id;
    private String username;
    private String userpwd;

}

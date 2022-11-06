package com.jjj.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @className: com.jjj.boot.exception.MyException
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-05 22:22
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class MyException extends Exception {
    public MyException() {
        super("我乱搞的");
    }
}

package com.jjj.boot.controller;

import com.jjj.boot.exception.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @className: com.jjj.boot.controller.ViewController
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-03 22:24
 */
@Controller
public class ViewController {
    @RequestMapping("/page01")
    public String toPageOne(Model model) {
        model.addAttribute("abc", "请求域中的值");
        return "forward:/page02";
    }

    @RequestMapping("/page02")
    public String toPageTwo(Model model) {
        model.addAttribute("abc", "请求域中的值");
        return "page01";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upLoad(@RequestPart("file") MultipartFile file, @RequestPart("files") MultipartFile[] files) {
        return "bcd";
    }

    @RequestMapping("/errorRequest")
    public String error(@RequestParam("key") String key) throws MyException {
//        int a = 10 / 0;
        throw new MyException();
    }
}

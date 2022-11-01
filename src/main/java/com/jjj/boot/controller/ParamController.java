package com.jjj.boot.controller;

import com.jjj.boot.pojo.Pet;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @className: com.jjj.boot.controller.ParamController
 * @description:
 * @author: 江骏杰
 * @create: 2022-10-30 22:03
 */
@RestController
public class ParamController {
    @RequestMapping("/param")
    public String param(@RequestParam("name") String name,
                        @RequestParam("age") String age,
                        @RequestParam Map<String, String> map1) {
        return name + age + "|||" + map1;
    }

    @RequestMapping("/path/{name}/{age}")
    public String path(@PathVariable("name") String name,
                       @PathVariable("age") String age,
                       @PathVariable Map<String, String> map2) {
        return name + age + "|||" + map2;

    }

    @RequestMapping("/matrix/{boss}/{employee}")
    public String matrix(@MatrixVariable(value = "age", pathVar = "boss") String bossAge,
                         @MatrixVariable(value = "age", pathVar = "employee") String empAge) {
        return "boss:" + bossAge + "| empAge:" + empAge;
    }

    @RequestMapping("/cookie")
    public String cookie(/*@CookieValue(value = "coo", required = false) String coo,
                         @CookieValue(value = "coo", required = false) Cookie cookie,*/
                         HttpServletResponse response) {
        /*Cookie coo1 = new Cookie("coo", "123");
        response.addCookie(coo1);
        return coo + cookie;*/
        return response + "";
    }

    @RequestMapping("/header")
    public String header(@RequestHeader("Accept") String accept,
                         @RequestHeader Map<String, String> map
    ) {
        return accept + map;
    }

    @RequestMapping("/body")
    public String body(@RequestBody String content) {
        System.out.println(content);
        return "111";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        model.addAttribute("key", "value");
        return "123";
    }

    @PostMapping("/pet")
    public Pet getPet(Pet pet) {
        return pet;
    }
}

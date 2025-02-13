package com.ll.demo03.domain.home.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Value("${custom.site.name}")
    private String siteName;
    @Value("${custom.secret.key}")
    private String secretKey;

    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "Hello, World!!!!!, on " + siteName+", 안녕하세요! 나는 왈도입니다.\r\n당신도 왈도입니까?\r\n당신도 왈도가 되십시오!";
    }

    @GetMapping("/secretKey")
    @ResponseBody
    public String showSecretKey() {
        return "secretKey : " + secretKey+", 나의 비밀친구";
    }
}

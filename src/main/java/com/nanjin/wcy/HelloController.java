package com.nanjin.wcy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class HelloController {

    @RequestMapping("/test")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/test/v1")
    @ResponseBody
    public String test() {
        return "test123123";

    }
}
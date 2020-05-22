package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Guan on 2020/5/23.
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello springboot";
    }
}

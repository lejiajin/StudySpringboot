package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*
* Spinrgboot
*
* */
@RestController
public class SpringController {
    @RequestMapping("/one")
    public String one(){
        return "345";
    }

}

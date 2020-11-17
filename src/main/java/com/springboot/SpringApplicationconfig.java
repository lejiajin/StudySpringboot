package com.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
* springboot启动类文件路径放在文件路径顶部
*
*
* */
@RestController
@SpringBootApplication
public class SpringApplicationconfig {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationconfig.class);
    }
    @RequestMapping("/hello")
    public  String hello(){
        return  "你好！!";
    }
}

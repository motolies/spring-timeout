package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/")
    public MyResponse index() throws InterruptedException {
        Thread.sleep(20000);

        MyResponse response = new MyResponse();
        response.setMsg("Greetings from Spring Boot!");
        return response;
    }

    @RequestMapping("/test")
    public MyResponse test() throws InterruptedException {
        Thread.sleep(20000);
        MyResponse response = new MyResponse();
        response.setMsg("This is a test!");
        return response;
    }

    @RequestMapping("/test/1")
    public MyResponse test1() throws InterruptedException {
        Thread.sleep(20000);
        MyResponse response = new MyResponse();
        response.setMsg("This is a test 1!");
        return response;
    }


}


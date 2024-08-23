package com.example.shop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Message from spring-boot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String indexHello() {
        return "Message from spring";
    }

}

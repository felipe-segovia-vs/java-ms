package com.valposystems.javams.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/data")
    public String getHello(){
        log.info("Hello log from demo controller");
        return "Hello from demo controller";
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "Hello from test";
    }

    @RequestMapping(value = "test2")
    public String test2(){
        return "Hello from test2";
    }

}

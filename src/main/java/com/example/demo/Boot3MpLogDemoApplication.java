package com.example.demo;

import com.mzt.logapi.starter.annotation.EnableLogRecord;
import com.mzt.logapi.starter.annotation.LogRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableLogRecord(tenant = "test")
@RestController
@SpringBootApplication
public class Boot3MpLogDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot3MpLogDemoApplication.class, args);
    }

    @LogRecord(success = "{{#name}} access", type = "test", bizNo = "test")
    @GetMapping("/")
    public String hello(String name) {
        return "hello world," + name;
    }
}

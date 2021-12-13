package com.example.myspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class DemoController {

    @GetMapping("/demo")

    public String sayHello(@RequestParam(value = "name", defaultValue = "Popat") String name, @RequestParam(value = "address", defaultValue = "Chiraigaon") String address) {
        return "index.html";
    }
    @GetMapping("/demohtml")

    public String sayHtml(@RequestParam(value = "name", defaultValue = "Popat") String name, @RequestParam(value = "address", defaultValue = "Chiraigaon") String address) {
        return "test.html";// String.format("Demo %s from %s", name, address);
    }

}

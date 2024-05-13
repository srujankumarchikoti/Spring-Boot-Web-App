package com.csk.springmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main Application controller.
 *
 * @author Srujan
 */
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.csk.*")
public class MyApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}

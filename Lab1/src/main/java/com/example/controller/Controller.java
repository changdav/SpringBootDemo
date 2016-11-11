package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by David on 11/11/16.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String controllerMethod() {
        return "hello";
    }
}

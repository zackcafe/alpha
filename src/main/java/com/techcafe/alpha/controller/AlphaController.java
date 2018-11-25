package com.techcafe.alpha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zlliu on 2018/11/25.
 */
@RestController
@RequestMapping(value = "/alpha")
public class AlphaController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}

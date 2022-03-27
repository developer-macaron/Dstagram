package com.macaron.dstagram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("/api/test")
    public List<String> test() {
        return Arrays.asList("hi");
    }
}

package com.example.testjudgeserver.kube;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiveController {

    @RequestMapping("/api/test")
    public String live() {
        return "OK";
    }
}

package com.example.htmxdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {

    @PostMapping("/update")
    public String update(String name) {
        // データベースを更新する

        return "updated　sucqessfully!";
    }
}

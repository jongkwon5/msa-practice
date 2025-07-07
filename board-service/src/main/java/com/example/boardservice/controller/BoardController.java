package com.example.boardservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/hello")
    public String hello(){
        return "이건 보드 헬로입니다.";
    }
}

package com.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 json을 반환하는 컨트롤러로 만들어 준다
public class HelloController {


    @GetMapping("/hello") //http Method인 get의 요청을 받을 수 있는 API를 만들어 준다.
    public String hello() {
        return "hello";
    }
}

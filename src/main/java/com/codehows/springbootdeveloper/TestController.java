package com.codehows.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // /test Get 요청이 오면 test() 메서드 실행
    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }

}

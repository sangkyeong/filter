package com.example.filter.controller;

import com.example.filter.interceptor.OpenAPi;
import com.example.filter.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@OpenAPi
@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserApiController {

    @OpenAPi
    @PostMapping("")
    public UserRequest register(
            @RequestBody
            UserRequest userRequest
    ){
        log.info("userRequest : {}",userRequest); //userRequest : {user_name=null, phone_number=null, age=152, email=hong@gmail.com}
        //log.info("http : {}",http.getBody()); //http : {user_name=홍길동, phone_number=010-1111-2222, age=152, email=hong@gmail.com}
        return userRequest;
    }

    @GetMapping("/hello")
    public void hello(){
        log.info("hello");
    }
}

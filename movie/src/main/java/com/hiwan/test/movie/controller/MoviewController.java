package com.hiwan.test.movie.controller;


import com.hiwan.test.movie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MoviewController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.userServiceUrl}")
    private String  userServiceUrl;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        System.out.println(this.userServiceUrl);
        return this.restTemplate.getForObject(this.userServiceUrl+id,User.class);
    }
}

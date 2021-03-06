package com.hiwan.test.user_eureka.Controller;

import com.hiwan.test.user_eureka.pojo.User;
import com.hiwan.test.user_eureka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = this.userRepository.findOne(id);
        return user;
    }
}

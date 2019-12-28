package com.springboot.security.jdbc.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homeResource(){
        return "<h2> Home </h2>";
    }

    @GetMapping("/user")
    public String userResource(){
        return "<h2>User</h2>";
    }

    @GetMapping("/admin")
    public String adminResource(){
        return "<h2>Admin</h2>";
    }
}

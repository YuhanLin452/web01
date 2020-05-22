package com.qf.controller;

import com.qf.domain.Person;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "my")
public class HelloController {
//    @Value("${name}")
//    private String name;
    private Person person;
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return person + "hello spring";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String userList(){
        return userService.findUser().toString();
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

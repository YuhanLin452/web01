package com.qf;

import com.qf.domain.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class client {
    @Autowired
    private UserService userService;
    @Test
    public void test01(){
        List<User> list = userService.findUser();
        System.out.println(list);
    }
}

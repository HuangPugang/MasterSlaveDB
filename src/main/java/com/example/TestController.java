package com.example;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * Created by paul on 16/11/18.
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    UserService userService;
    public static int index = 110;

    @RequestMapping("/insert")
    public String test() {
        Random random = new Random(1000);
        int i = userService.insert(new User(++index, "huang" + random.nextInt(), "h9911" + random.nextInt(), random.nextInt()));
        return i + "haha";
    }

    @RequestMapping("/insertSlave")
    public String insertSlave() {
        Random random = new Random(1000);
        int i = userService.insertSlave(new User(++index, "huang" + random.nextInt(), "h9911" + random.nextInt(), random.nextInt()));
        return i + "slave";
    }


    @RequestMapping("/find")
    public List<User> find() {
        List<User> list = userService.findAll();
        return list;
    }

}

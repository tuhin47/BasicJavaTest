package me.tuhin47.basicjavatest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class PasswordCheckController {
    @GetMapping("/user")
    public User getUser() {
        return null;
    }

    @PostMapping("/user")
    public User getUser(@RequestBody User user) {
        System.out.println(user);
        System.out.println(Arrays.toString(user.getPassword()) + "===" + Arrays.toString("samad".toCharArray()));
        System.out.println(Arrays.hashCode(user.getPassword()) == Arrays.hashCode("samad".toCharArray()));
        return user;
    }


}

package com.example.jpamybaits.Controller;


import com.example.jpamybaits.user.User;
import com.example.jpamybaits.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Controller {

    private UserService userService;

    @Autowired
    public Controller(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/add")
    public int addUser(@RequestBody User user){
        return userService.addUserByMaits(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.findUserByMybaits(id);
    }

    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable Long id){
        return userService.deleteUserBYMybaits(id);
    }
}

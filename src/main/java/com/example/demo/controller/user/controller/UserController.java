package com.example.demo.controller.user.controller;

import com.example.demo.controller.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/users")
    public List<User> userList(){
        List<User> result=new ArrayList<User>();

        for (int i=0;i<3;i++){
            User user=new User();
            user.setId(i);
            user.setName("name_"+i);
            user.setPassword("password_"+i);
            user.setPhone("phone_"+i);
            result.add(user);
        }

        return result;
    }



    @GetMapping("/users/{id}")
    public User getUser(@PathVariable(value = "id") Integer id){

        User user=new User();
        user.setId(id);
        user.setName("name_"+id);
        user.setPassword("password_"+id);
        user.setPhone("phone_"+id);
        return user;

    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return "添加成功";
    }

    @PutMapping("/users/{id}/delete")
    public String deleteUser(@PathVariable(value = "id") Integer id){
        return "删除成功";
    }


}

package com.shizuca.sazuki.controller;

import com.shizuca.sazuki.model.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController
{
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return ResponseEntity.ok(new User().getCloneUser(id));
    }

    @GetMapping("")
    public ResponseEntity<ArrayList<User>> getUserList(){
        var userList = new ArrayList<User>();
        for(var i = 0; i < 100 ; i++ ){
            userList.add(new User().getCloneUser(i));
        }

        return ResponseEntity.ok(userList);
    }

}

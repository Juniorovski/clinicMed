package com.juniormelodeveloper.ClinicMedic.controller;

import com.juniormelodeveloper.ClinicMedic.model.User;
import com.juniormelodeveloper.ClinicMedic.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService service;
    public UserController(UserService service){
        this.service=service;
    }
    @GetMapping
    List<User>list(User user){
        return service.read();
    }
    @PostMapping
    List<User>save(@RequestBody User user){
        return service.create(user);
    }
    @PutMapping
    List<User>update(@RequestBody User user){
        return service.update(user);
    }
    @DeleteMapping("/{id}")
    List<User>delete(@PathVariable("id")Long id){
        return service.delete(id);
    }
}

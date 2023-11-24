package com.juniormelodeveloper.ClinicMedic.service;


import com.juniormelodeveloper.ClinicMedic.model.User;
import com.juniormelodeveloper.ClinicMedic.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private UserRepository repository;
    public UserService(UserRepository repository){
        this.repository=repository;
    }
    public List<User>create(User user){
        repository.save(user);
        return null;
    }
    public List<User>read(){
        return repository.findAll();
    }
    public List<User>update(User user){
         repository.save(user);
         return null;
    }
    public List<User>delete(Long id){
        repository.deleteById(id);
        return null;
    }
}
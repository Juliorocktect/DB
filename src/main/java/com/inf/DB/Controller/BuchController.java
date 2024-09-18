package com.inf.DB.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.inf.DB.Model.User;
import com.inf.DB.Repo.BuchRepo;

@RestController
@Controller
@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
public class BuchController{
    @Autowired
    private BuchRepo repo;

    @GetMapping("/test")
    public User testConnectionToDatabase(@RequestParam String id){
        return repo.getUserById(id);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return repo.getUsers();
    }
}

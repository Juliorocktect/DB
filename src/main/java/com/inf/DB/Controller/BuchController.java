package com.inf.DB.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.inf.DB.Model.User;
import com.inf.DB.Repo.BuchRepo;

@RestController
@Controller
public class BuchController{
    @Autowired
    private BuchRepo repo;

    @GetMapping("/test")
    public User testConnectionToDatabase(@RequestParam String id){
        return repo.getUserById(id);
    }
}

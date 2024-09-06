package com.inf.DB.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class BuchController{

    @GetMapping("/test")
    public String testConnectionToDatabase(){
        return "true";
    }
}

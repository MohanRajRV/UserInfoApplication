package com.ace.project.UserInfoPortal.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.ace.project.UserInfoPortal.model.UserInfo;
import com.ace.project.UserInfoPortal.respository.UserRepository;

@Controller
public class LoginPage {

    @Autowired
    private UserRepository userrepository;

    @GetMapping("/")
    public String displayPage() {
        return "index"; //main page
    }
   
    @GetMapping("/login")
    public  String RetriveData(Model m ,@RequestParam("id")Integer id,@RequestParam("password")String pass) {
    
    		UserInfo user = userrepository.findById(id).get();
    		if(user.getPassword().equals(pass)) {
    		m.addAttribute("user",user);
    		return "Profile";
    		}
    		return "erro";
    }

    @GetMapping("/register")
    public String newUser() {
        return "NewUser";  // Register page
    }

    @PostMapping("/userdetails")
    public String displayUser(Model model,
                              @RequestParam("name") String name,
                              @RequestParam("password") String password,
                              @RequestParam("email") String email,
                              @RequestParam("department") String department,
                              @RequestParam("projectLink") String projectLink,
                              @RequestParam("description") String description,
                              @RequestParam("photo") MultipartFile photo) throws IOException {
        
        byte[] photoBytes = photo.getBytes();

        
        UserInfo user = new UserInfo(name, password, email, projectLink, description, photoBytes);

        
        userrepository.save(user);// this is used to store the data in database

        
        model.addAttribute("user", user);

        return "Profile";
    }
    @GetMapping("/mainpage")
    public String loginpage() {
        return "index";  
    }
}
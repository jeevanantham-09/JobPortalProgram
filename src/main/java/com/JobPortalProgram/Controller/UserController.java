package com.JobPortalProgram.Controller;

import com.JobPortalProgram.Dto.userdto;
import com.JobPortalProgram.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

@Autowired
    private UserService userService;

@GetMapping("/userInformation")
    public String getUserInformation(@ModelAttribute("User") userdto userdto) {
     return "userinfo";
    }
    @PostMapping("/userInformation")
    public String saveUserInformation(@ModelAttribute("User") userdto userdto , Model model) {
        userService.save (userdto);
        model.addAttribute("message", "Details saved successfully");
      return "userinfo";
    }

}

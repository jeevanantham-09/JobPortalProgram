package com.JobPortalProgram.Controller;

import com.JobPortalProgram.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {

@Autowired
    private UserService userService;



}

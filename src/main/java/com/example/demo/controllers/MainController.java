package com.example.demo.controllers;

import com.example.demo.models.Admins;
import com.example.demo.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class MainController {
    @Autowired
    AdminRepo adminRepo;
    @GetMapping
    public String getMainPage(){
        Admins admins = new Admins();
        admins.setName("admin");
        admins.setPassword("admin");
        adminRepo.save(admins);
        return "index";
    }
}

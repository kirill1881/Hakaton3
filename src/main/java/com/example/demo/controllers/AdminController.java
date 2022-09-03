package com.example.demo.controllers;

import com.example.demo.models.Admins;
import com.example.demo.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminRepo adminRepo;

    @GetMapping
    public List<Admins> getMessage () {
        List<Admins> admins = adminRepo.findAll();
       return admins;
    }
}

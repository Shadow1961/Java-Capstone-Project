package com.example.CMSSystem;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

@Controller
public class Dashboard {

    @Autowired
    Service service;

    @GetMapping("/adminDashboard/{token}")
    public String adminDashboard(@PathVariable String token)
    {
        Map<String, String> map=service.validateToken(token,"admin").getBody();
        System.out.println("map"+map);
        if(map.isEmpty())
        {
            return "admin/adminDashboard";
        }
        return "redirect:http://localhost:8080";

    }

}

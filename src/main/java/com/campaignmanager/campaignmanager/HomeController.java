package com.campaignmanager.campaignmanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "redirect:/api"; // Przekierowanie na dostępny endpoint
    }
}
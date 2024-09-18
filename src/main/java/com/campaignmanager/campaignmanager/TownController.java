package com.campaignmanager.campaignmanager;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "https://campaign-manager-frontend-501e228fc453.herokuapp.com")
@RequestMapping("/api/towns")
public class TownController {

    @GetMapping
    public List<String> getTowns() {
        // Pre-populated towns list
        return Arrays.asList("Warszawa", "Kraków", "Wrocław", "Poznań", "Gdańsk", "Szczecin");
    }
}

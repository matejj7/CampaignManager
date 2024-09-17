package com.campaignmanager.campaignmanager;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/towns")
public class TownController {

    @GetMapping
    public List<String> getTowns() {
        // Pre-populated lista miast
        return Arrays.asList("Warszawa", "Kraków", "Wrocław", "Poznań", "Gdańsk", "Szczecin");
    }
}

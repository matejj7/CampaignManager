package com.campaignmanager.campaignmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/keywords")
public class KeywordController {

    @GetMapping
    public List<String> getKeywords() {
        return Arrays.asList("promotion", "sale", "discount", "new year", "clearance");
    }
}

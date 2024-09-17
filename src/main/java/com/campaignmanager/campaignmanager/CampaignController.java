package com.campaignmanager.campaignmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {
    @Autowired
    private CampaignService campaignService;

    @PostMapping("/{userId}")
    public Campaign createCampaign(@PathVariable Long userId, @RequestBody Campaign campaign){
        return campaignService.createCampaign(campaign, userId);
    }
    @GetMapping
    public List<Campaign> getAllCampaigns(){
        return campaignService.getCampaigns();
    }

    @PutMapping("/{id}")
    public Campaign updateCampaign(@PathVariable Long id, @RequestBody Campaign campaignDetails){
        return campaignService.updateCampaign(id, campaignDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCampaign(@PathVariable Long id){
        campaignService.deleteCampaign(id);
        return ResponseEntity.ok().build();

    }



}

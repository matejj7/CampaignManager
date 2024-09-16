package com.campaignmanager.campaignmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.naming.InsufficientResourcesException;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CampaignService {
    @Autowired
    private CampaignRepository campaignRepository;
    @Autowired
    private UserRepository userRepository;

    public Campaign createCampaign(Campaign campaignDetails, Long userId){
        User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User not found"));

        if(user.getEmeraldFunds() < campaignDetails.getCampaignFund()){
            throw new InsufficientFundsException("Not enough Emerald Funds");
        }
        // Odejmij kwotę kampanii od konta użytkownika
        user.setEmeraldFunds(user.getEmeraldFunds() - campaignDetails.getCampaignFund());

        // Zaktualizuj konto użytkownika
        userRepository.save(user);

        // Zapisz kampanię w bazie
        campaignRepository.save(campaignDetails);

        // Zwróć zaktualizowaną kampanię
        return campaignDetails;
    }
    public List<Campaign> getCampaigns(){
        return campaignRepository.findAll();
    }
    public Campaign updateCampaign(Long id, Campaign campaignDetails){
        Campaign updatedCampaign = campaignRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Campaign not found"));
        updatedCampaign.setCampaignName(campaignDetails.getCampaignName());
        updatedCampaign.setCampaignName(campaignDetails.getCampaignName());
        updatedCampaign.setKeywords(campaignDetails.getKeywords());
        updatedCampaign.setBidAmount(campaignDetails.getBidAmount());
        updatedCampaign.setCampaignFund(campaignDetails.getCampaignFund());
        updatedCampaign.setStatus(campaignDetails.getStatus());
        updatedCampaign.setTown(campaignDetails.getTown());
        updatedCampaign.setRadius(campaignDetails.getRadius());

        return campaignRepository.save(updatedCampaign);
    }
    public void deleteCampaign(Long id){
        Campaign deletedCampaign = campaignRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Campaign not found"));
        campaignRepository.delete(deletedCampaign);
    }


}

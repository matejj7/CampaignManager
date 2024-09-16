package com.campaignmanager.campaignmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String campaignName;
    @NotNull
    private String keywords;
    @NotNull
    @DecimalMin(value = "1.0", inclusive = true)
    private Double bidAmount;
    @NotNull
    private Boolean status;
    @NotNull
    private String town;
    @NotNull
    private Double radius;
    @NotNull
    private Double campaignFund;


}

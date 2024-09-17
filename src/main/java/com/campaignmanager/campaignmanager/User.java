package com.campaignmanager.campaignmanager;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "campaign_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String userName;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = true)
    private Double emeraldFunds;

}

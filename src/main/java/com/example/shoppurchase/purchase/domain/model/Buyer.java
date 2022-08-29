package com.example.shoppurchase.purchase.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class Buyer {
    //private MembershipLevelType membershipLevelType;
    private String name;
}

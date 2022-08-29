package com.example.shoppurchase.purchase.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Data
public class Receiver {
    private String address;
    private String receiverName;
    private int zipCode;
}

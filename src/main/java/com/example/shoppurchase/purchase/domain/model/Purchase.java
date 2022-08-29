package com.example.shoppurchase.purchase.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Purchase {
    private Buyer buyer;
    private Long id;
    private List<PurchaseItem> purchaseItems;
    private String purchaseNumber;
    private Receiver receiver;
    private String totalPrice;
}

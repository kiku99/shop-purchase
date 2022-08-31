package com.example.shoppurchase.purchase.domain.service;

import com.example.shoppurchase.purchase.domain.model.Purchase;
import com.example.shoppurchase.purchase.domain.proxy.dto.account.AccountDTO;

public class OrderLogic {


    @Override
    public Purchase Order(Long id, String purchaseNumber, String buyerName, String productName){
        AccountDTO accountDTO = accountProxy.findAccountByName(buyerName);
    }
}



package com.example.shoppurchase.purchase.domain.proxy;

import com.example.shoppurchase.purchase.domain.proxy.dto.account.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;

@Service
public class AccountProxy {

    @Autowired
    AccountDTOClient accountDTOClient;

    public InputStream findAccountDTO(Long id) throws IOException {
        return accountDTOClient.findAccount(id).getInputStream();
    }

    public Class<? extends Resources> findAllAccountDTOs() throws IOException {
        return accountDTOClient.findAllAccounts().getClass();
    }

    public Class<? extends Resources> findAllAccountDTOs(int size) throws IOException {
        return accountDTOClient.findAllAccounts(size).getClass();
    }

    public AccountDTO findAccountByName(String name){
        return accountDTOClient.findAccount(name);
    }
    @FeignClient(name = "acccounts", url = "${service-urls.shop-account}", configuration = FeignClientProperties.FeignClientConfiguration.class)
    interface AccountDTOClient{
        @GetMapping("accounts/{id}")
        Resource findAccount(@PathVariable("id") Long id);

        @GetMapping("accounts")
        Resources findAllAccounts();

        @GetMapping("accounts")
        Resources findAllAccounts(@RequestParam("size") int size);

        @GetMapping("accounts/search/findByName")
        AccountDTO findAccount(@RequestParam(value = "name", required = true) String name);
    }
}

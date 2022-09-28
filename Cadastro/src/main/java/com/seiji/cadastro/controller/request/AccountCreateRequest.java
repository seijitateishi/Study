package com.seiji.cadastro.controller.request;

import com.seiji.cadastro.object.Account;
import com.seiji.cadastro.object.Wallet;
import com.seiji.cadastro.service.WalletService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCreateRequest {
    private String name;

    public Account toModel(WalletService walletService) {
        var wallet = new Wallet();
        walletService.save(wallet);

        return new Account(wallet, name);
    }

}

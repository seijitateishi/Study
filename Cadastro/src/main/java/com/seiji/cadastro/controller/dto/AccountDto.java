package com.seiji.cadastro.controller.dto;

import com.seiji.cadastro.object.Account;
import com.seiji.cadastro.object.Wallet;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link com.seiji.cadastro.object.Account} entity
 */
@Data
public class AccountDto implements Serializable {
    private final Long id;
    private final String name;
    private final WalletDto wallet;

    public AccountDto(Account account) {
        this.id = account.getId();
        this.name = account.getName();
        this.wallet = new WalletDto(account.getWallet());
    }
}
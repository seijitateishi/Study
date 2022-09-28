package com.seiji.cadastro.controller.dto;

import com.seiji.cadastro.object.Wallet;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.seiji.cadastro.object.Wallet} entity
 */
@Data
public class WalletDto implements Serializable {
    private final Long id;
    private final int balance;

    public WalletDto(Wallet wallet) {
        this.id = wallet.getId();
        this.balance = wallet.getBalance();
    }
}
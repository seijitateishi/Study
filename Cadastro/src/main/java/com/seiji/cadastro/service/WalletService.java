package com.seiji.cadastro.service;

import com.seiji.cadastro.object.Account;
import com.seiji.cadastro.object.Wallet;
import com.seiji.cadastro.repository.AccountRepository;
import com.seiji.cadastro.repository.WalletRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public void save(Wallet wallet) {
        walletRepository.save(wallet);
    }

    public List<Wallet> findAll() {
        return walletRepository.findAll();
    }
}

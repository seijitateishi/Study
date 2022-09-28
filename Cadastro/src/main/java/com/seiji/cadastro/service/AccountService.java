package com.seiji.cadastro.service;

import com.seiji.cadastro.object.Account;
import com.seiji.cadastro.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void save(Account account) {
        accountRepository.save(account);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public List<Account> findAllByNameEquals(String name){ return accountRepository.findAllByNameEquals(name); }

    public Account findById(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }

}

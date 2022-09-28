package com.seiji.cadastro.controller;

import com.seiji.cadastro.controller.dto.AccountDto;
import com.seiji.cadastro.controller.request.AccountCreateRequest;
import com.seiji.cadastro.object.Account;
import com.seiji.cadastro.repository.AccountRepository;
import com.seiji.cadastro.service.AccountService;
import com.seiji.cadastro.service.WalletService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;
    private final WalletService walletService;

    public AccountController(AccountService accountService, WalletService walletService) {
        this.accountService = accountService;
        this.walletService = walletService;
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody AccountCreateRequest request) {
        accountService.save(request.toModel(walletService));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> findAll() {
        var accounts = accountService.findAll();
        var accountsDto = accounts.stream().map(AccountDto::new).toList();

        return ResponseEntity.status(HttpStatus.OK).body(accountsDto);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<AccountDto>> teste(@PathVariable String name) {
        var accounts  = accountService.findAllByNameEquals(name);
        var accountsDto = accounts.stream().map(AccountDto::new).toList();
        return ResponseEntity.status(HttpStatus.OK).body(accountsDto);
    }

    @PostMapping("/{account_id}/deposit/{value}")
    public ResponseEntity<String> deposit(@PathVariable(value = "account_id") Long accountId, @PathVariable int value) {
        var account = accountService.findById(accountId);
        var wallet = account.getWallet();
        wallet.setBalance(wallet.getBalance() + value);
        accountService.save(account);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

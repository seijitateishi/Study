package com.seiji.cadastro.repository;

import com.seiji.cadastro.object.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findAllByNameEquals(String name);
}
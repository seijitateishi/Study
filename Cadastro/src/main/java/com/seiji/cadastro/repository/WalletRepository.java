package com.seiji.cadastro.repository;

import com.seiji.cadastro.object.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
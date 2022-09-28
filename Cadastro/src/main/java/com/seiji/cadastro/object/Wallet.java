package com.seiji.cadastro.object;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Account account;

    @Column(nullable = false)
    private int balance;

    public Wallet() {
        this.balance = 0;
    }
}

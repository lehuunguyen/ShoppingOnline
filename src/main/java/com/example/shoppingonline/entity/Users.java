package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    private String account;

    private String password;

    private String role;

    private String status;

    @OneToMany(mappedBy = "orderUser",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Orders> orderList;

    @OneToMany(mappedBy = "userAddress",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Address> userAddressList;

    @OneToMany(mappedBy = "userSeller",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Product> productSellList;
}

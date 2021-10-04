package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private Users userAddress;

    @Column(name = "name")
    private String name;

    private String address;

    private int priority;
}

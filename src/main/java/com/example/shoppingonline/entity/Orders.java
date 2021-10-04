package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private Users orderUser;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "address")
    private String address;

    @Column(name = "note")
    private String note;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "orderDetail",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetailList;
}

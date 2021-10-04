package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Order_detail")
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Long orderDetailId;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "order_id",nullable = false)
    private Orders orderDetail;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "product_id",nullable = false)
    private Product productDetail;

    @Column(name = "product_quantity")
    private int productQuantity;
}

package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
@Data
public class Product {
    @Id //sua
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "product_image",
            joinColumns = { @JoinColumn(name = "productT_id") },
            inverseJoinColumns = { @JoinColumn(name = "imageT_id") })
    private List<Images> image;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "category_id",nullable = false)
    private Category productCategory;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "subcategory_id",nullable = false)
    private Subcategory productSubCategory;

    private String title;

    private String description;

    private double price;

    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private Users userSeller;

    private int view;

    private String sex;

    private String vaccination;

    private String insurance;

    private String status;
}

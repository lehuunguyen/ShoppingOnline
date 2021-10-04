package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Subcategory")
@Data
public class Subcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subcategory_id")
    private Long subCategoryId;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "category_id",nullable = false)
    private Category subCategory;

    @OneToMany(mappedBy = "productSubCategory",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Product> productList;

    private String name;
}

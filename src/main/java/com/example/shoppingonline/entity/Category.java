package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    private String name;

    @OneToOne(mappedBy = "imageCategory",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Images images;

    @OneToMany(mappedBy = "productCategory",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Product> productList;

    @OneToMany(mappedBy = "subCategory",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Subcategory> subcategoryList;
}

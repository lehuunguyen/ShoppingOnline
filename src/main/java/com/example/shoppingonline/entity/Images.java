package com.example.shoppingonline.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Images")
@Data
public class Images {
    @Id
    @Column(name = "image_id")
    private Long imageId;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "image")
    private List<Product> productList;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "category_id")
    private Category imageCategory;

    @Column(name = "image_name")
    private String imageName;
}

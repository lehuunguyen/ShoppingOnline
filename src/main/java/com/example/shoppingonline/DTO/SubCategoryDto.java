package com.example.shoppingonline.DTO;

import lombok.Data;

@Data
public class SubCategoryDto {
    private Long subCategoryId;
    private Long categoryId;
    private String name;
}

package com.example.shoppingonline.service;

import com.example.shoppingonline.DTO.CategoryDto;
import com.example.shoppingonline.entity.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getAllCategory();
    List<CategoryDto> getAllCategoryDto();

    CategoryDto create(CategoryDto categoryDto);
    CategoryDto update(CategoryDto categoryDto);
//nguyendeptrai

    void delete(Long id);
}

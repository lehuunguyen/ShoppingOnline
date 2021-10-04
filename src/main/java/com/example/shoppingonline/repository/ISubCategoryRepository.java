package com.example.shoppingonline.repository;

import com.example.shoppingonline.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubCategoryRepository extends JpaRepository<Subcategory, Long> {
}

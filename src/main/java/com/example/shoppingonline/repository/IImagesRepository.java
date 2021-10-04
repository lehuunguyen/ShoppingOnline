package com.example.shoppingonline.repository;

import com.example.shoppingonline.entity.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImagesRepository extends JpaRepository<Images, Long> {
}

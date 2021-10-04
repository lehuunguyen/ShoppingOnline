package com.example.shoppingonline.repository;

import com.example.shoppingonline.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOderDetailRepository extends JpaRepository<OrderDetail, Long> {
}

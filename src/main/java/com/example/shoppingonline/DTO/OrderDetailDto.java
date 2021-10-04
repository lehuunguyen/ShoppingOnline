package com.example.shoppingonline.DTO;

import lombok.Data;

@Data
public class OrderDetailDto {
    private Long orderDetailId;
    private Long productId;
    private int productQuantity;
}

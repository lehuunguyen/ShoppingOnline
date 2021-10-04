package com.example.shoppingonline.DTO;

import lombok.Data;

@Data
public class OrdersDto {
    private Long orderId;
    private Long userId;
    private double totalPrice;
    private String address;
    private String note;
    private String status;
}


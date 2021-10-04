package com.example.shoppingonline.DTO;

import lombok.Data;

@Data
public class UserDto {
    private Long userId;
    private String account;
    private String role;
    private String status;
}

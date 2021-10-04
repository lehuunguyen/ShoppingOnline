package com.example.shoppingonline.service;

import com.example.shoppingonline.DTO.AddressDto;
import com.example.shoppingonline.entity.Address;

import java.util.List;

public interface IAddressService {
    List<Address> getAllAddress();
    List<AddressDto> getAllAddressDto();

    AddressDto create(AddressDto addressDto);
    AddressDto update(AddressDto addressDto);

    void delete(Long id);
}

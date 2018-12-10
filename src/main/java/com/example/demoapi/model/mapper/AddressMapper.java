package com.example.demoapi.model.mapper;

import org.mapstruct.Mapper;

import com.example.demoapi.model.Address;
import com.example.demoapi.model.dto.AddressDto;

@Mapper(componentModel = "spring")
public interface AddressMapper {
	public AddressDto addressToAddressDTO(Address address);
	public Address addressDtoToAddress(AddressDto addressDto);
}

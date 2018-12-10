package com.example.demoapi.model.dto;

public class AddressDto {

	private long id;
	private String address;

	public AddressDto() {
	}

	public AddressDto(long id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AddressDTO [id=" + id + ", address=" + address + "]";
	}

}

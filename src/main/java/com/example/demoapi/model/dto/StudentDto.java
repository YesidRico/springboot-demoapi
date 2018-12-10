package com.example.demoapi.model.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class StudentDto {

	private long id;

	@NotEmpty
	@NotNull
	private String name;

	@NotEmpty
	@NotNull
	private String LastName;

	private List<AddressDto> address;

	public StudentDto() {
	}

	public StudentDto(long id, String name, String lastName, List<AddressDto> address) {
		super();
		this.id = id;
		this.name = name;
		LastName = lastName;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public List<AddressDto> getAddress() {
		return address;
	}

	public void setAddress(List<AddressDto> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", LastName=" + LastName + ", address=" + address + "]";
	}

}

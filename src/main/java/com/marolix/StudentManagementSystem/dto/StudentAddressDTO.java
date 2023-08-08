package com.marolix.StudentManagementSystem.dto;

import com.marolix.StudentManagementSystem.entity.StudentAddressType;

public class StudentAddressDTO {
	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pincode;
	private String state;
	private StudentAddressType addressType;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public StudentAddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(StudentAddressType addressType) {
		this.addressType = addressType;
	}

}

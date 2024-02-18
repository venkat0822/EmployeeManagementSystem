package com.system.EmployeeManagement.employeeData;

public class AddressDetails {

    private int doorNo,pinCode;

    public AddressDetails(int doorNo2, String city2, String state2, String country2, int pinCode2) {
    }
    public AddressDetails(int doorNo, int pinCode, String street, String city, String state, String country) {
        this.doorNo = doorNo;
        this.pinCode = pinCode;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
    private String street,city,state,country;
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode2) {
		this.pinCode = pinCode2;
	}
	public String getStreet() {
		return street;
	}  
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}

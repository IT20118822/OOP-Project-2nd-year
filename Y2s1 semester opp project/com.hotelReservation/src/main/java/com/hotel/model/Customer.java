package com.hotel.model;

public class Customer {
	




	int customerid;
	String customerName;
	String fatherName;
	String customerEmail;
	String password;
	String address;
	String phoneNumber;
	
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerid, String customerName, String fatherName, String customerEmail, String password,String address, String phoneNumber) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.fatherName = fatherName;
		this.customerEmail = customerEmail;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}



	public int getcustomerid() {
		return customerid;
	}



	public void setcustomerid(int customerid) {
		this.customerid = customerid;
	}



	public String getcustomerName() {
		return customerName;
	}



	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getfatherName() {
		return fatherName;
	}



	public void setfatherName(String fatherName) {
		this.fatherName = fatherName;
	}



	public String getcustomerEmail() {
		return customerEmail;
	}



	public void setcustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	public String getpassword() {
		return password;
	}



	public void setpassword(String password) {
		this.password = password;
	}



	public String getaddress() {
		return address;
	}



	public void setaddress(String address) {
		this.address = address;
	}



	public String getphoneNumber() {
		return phoneNumber;
	}



	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	/*
	 * @Override public String toString() { return "Customer [customerid=" +
	 * customerid + ", customerName=" + customerName + ", fatherName=" + fatherName
	 * + ", customerEmail=" + customerEmail + ", address=" + address +
	 * ", phoneNumber=" + phoneNumber + "]"; }
	 */





	
	
	
	
	
	

}

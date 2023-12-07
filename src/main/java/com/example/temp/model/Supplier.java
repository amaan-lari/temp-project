package com.example.temp.model;

public class Supplier {
	int SupplierID;
	String CompanyName;
	String ContactName;
	String Address;
	String City;
	String Region;
	int PostalCode;
	String Country;
	int Phone;
	
	public Supplier(int supplierID, String companyName, String contactName, String address, String city, String region,
			int postalCode, String country, int phone) {
		super();
		SupplierID = supplierID;
		CompanyName = companyName;
		ContactName = contactName;
		Address = address;
		City = city;
		Region = region;
		PostalCode = postalCode;
		Country = country;
		Phone = phone;
	}
	
	public Supplier(String companyName, String contactName, String address, String city, String region,
			int postalCode, String country, int phone) {
		super();
		CompanyName = companyName;
		ContactName = contactName;
		Address = address;
		City = city;
		Region = region;
		PostalCode = postalCode;
		Country = country;
		Phone = phone;
	}
	

	public int getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(int supplierID) {
		SupplierID = supplierID;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public int getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(int postalCode) {
		PostalCode = postalCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Supplier [SupplierID=" + SupplierID + ", CompanyName=" + CompanyName + ", ContactName=" + ContactName
				+ ", Address=" + Address + ", City=" + City + ", Region=" + Region + ", PostalCode=" + PostalCode
				+ ", Country=" + Country + ", Phone=" + Phone + "]";
	}

}

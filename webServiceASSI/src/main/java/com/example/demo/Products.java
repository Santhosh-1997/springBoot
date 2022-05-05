package com.example.demo;

public class Products {

	private int id;
	private String name;
	private int price;
	private String brand;
	private String category;
	private String regNumber;
	private String manfId;
	
	public Products(int id, String name, int price, String brand, String category, String regNumber, String manfId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.regNumber = regNumber;
		this.manfId = manfId;
	}
	
	public Products() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getManfId() {
		return manfId;
	}
	public void setManfId(String manfId) {
		this.manfId = manfId;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
				+ category + ", regNumber=" + regNumber + ", manfId=" + manfId + "]";
	}
	
	
	
}

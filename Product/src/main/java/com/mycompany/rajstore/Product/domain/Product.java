package com.mycompany.rajstore.Product.domain;

public class Product {
	
	public Product()
	{}
	
	public Product(int id)
	{
	  this.id = id;	
	}
	
	private int id = 1;
	private String name = "oranges";
	private int catId = 2;
	
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
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}

}

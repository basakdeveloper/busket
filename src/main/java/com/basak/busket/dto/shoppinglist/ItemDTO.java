package com.basak.busket.dto.shoppinglist;

public class ItemDTO {
	
	private int id;
	
	private String name;
	
	private ShopDTO shop;

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

	public ShopDTO getShop() {
		return shop;
	}

	public void setShop(ShopDTO shop) {
		this.shop = shop;
	}

}

package com.basak.busket.dto.shoppinglist;

import java.io.Serializable;

public class ItemDTO implements Serializable {
	
	private static final long serialVersionUID = -8928226802503261394L;

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

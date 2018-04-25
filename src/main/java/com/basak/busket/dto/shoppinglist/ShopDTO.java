package com.basak.busket.dto.shoppinglist;

import java.util.List;

public class ShopDTO {

	private int id;
	
	private String name;
	
	private List<ItemDTO> items;

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

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	
}

package com.basak.homemaker.shoppingbusket.dto;

import java.io.Serializable;
import java.util.List;

public class ShopDTO implements Serializable {

	private static final long serialVersionUID = -6574476530848326684L;

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

package com.basak.busket;

import com.basak.busket.model.Item;

public class ItemVO {

	private int id;
	
	private String name;

	public ItemVO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ItemVO(Item item) {
		this.id = item.getId();
		this.name = item.getName();
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
}

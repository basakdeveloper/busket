package com.basak.busket;

import java.util.ArrayList;
import java.util.List;

import com.basak.busket.model.Item;
import com.basak.busket.model.Shop;

public class ShopVO {

	private int id;
	
	private String name;
	
	private List<ItemVO> items;

	public ShopVO(Shop shop, boolean fetchItems) {
		this.id = shop.getId();
		this.name = shop.getName();

		if (fetchItems) {
			this.items = new ArrayList<ItemVO>();
			if (shop.items != null && !shop.items.isEmpty()) {
				for (Item item : shop.items) {
					this.items.add(new ItemVO(item));
				}
			}
		}
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

	public List<ItemVO> getItems() {
		return items;
	}

	public void setItems(List<ItemVO> items) {
		this.items = items;
	}
	
}

package com.basak.busket.service;

import java.util.List;

import com.basak.busket.model.shoppinglist.Item;

public interface ItemService {

	public void saveItem(Item item);
	
	public void deleteItem(int itemId);
	
	public List<Item> getItems();
}

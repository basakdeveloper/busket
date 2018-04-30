package com.basak.homemaker.shoppingbusket.service;

import com.basak.homemaker.shoppingbusket.dto.ItemDTO;

public interface ItemService {

	public void saveItem(ItemDTO itemDTO);
	
	public void deleteItem(int itemId);

}

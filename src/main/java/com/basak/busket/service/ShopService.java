package com.basak.busket.service;

import java.util.List;

import com.basak.busket.dto.shoppinglist.ShopDTO;
import com.basak.busket.model.shoppinglist.Shop;

public interface ShopService {

	public List<ShopDTO> getShops();
	
	public Shop getShop(int shopId);
}

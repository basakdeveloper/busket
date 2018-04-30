package com.basak.homemaker.shoppingbusket.service;

import java.util.List;

import com.basak.homemaker.shoppingbusket.dto.ShopDTO;
import com.basak.homemaker.shoppingbusket.model.Shop;

public interface ShopService {

	public List<ShopDTO> getShops();
	
	public Shop getShop(int shopId);
}

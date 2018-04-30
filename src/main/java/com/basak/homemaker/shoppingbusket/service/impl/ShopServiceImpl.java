package com.basak.homemaker.shoppingbusket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.homemaker.shoppingbusket.dto.ShopDTO;
import com.basak.homemaker.shoppingbusket.dtomapper.ShopDTOMapper;
import com.basak.homemaker.shoppingbusket.model.Shop;
import com.basak.homemaker.shoppingbusket.repository.ShopRepository;
import com.basak.homemaker.shoppingbusket.service.ShopService;

@Service("shopService")
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopRepository shopRepository;
	
	@Autowired
	private ShopDTOMapper shopDTOMapper;
	
	@Override
	public List<ShopDTO> getShops() {
		List<Shop> shops = shopRepository.findAll();
		List<ShopDTO> shopDTOs = shopDTOMapper.shopsToShopDTOs(shops);
		
		return shopDTOs;
	}
	
	@Override
	public Shop getShop(int shopId) {
		return shopRepository.findById(shopId);
	}
	
}

package com.basak.busket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.busket.dto.shoppinglist.ShopDTO;
import com.basak.busket.model.shoppinglist.Shop;
import com.basak.busket.repository.ShopRepository;
import com.basak.busket.service.ShopService;
import com.basak.busket.utils.dtomapper.CycleAvoidingMappingContext;
import com.basak.busket.utils.dtomapper.ShopDTOMapper;

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

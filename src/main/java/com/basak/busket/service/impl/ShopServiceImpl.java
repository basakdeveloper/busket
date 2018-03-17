package com.basak.busket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.busket.model.Shop;
import com.basak.busket.repository.ShopRepository;
import com.basak.busket.service.ShopService;

@Service("shopService")
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopRepository shopRepository;
	
	@Override
	public List<Shop> getShops() {
		return shopRepository.findAll();
	}
	
}

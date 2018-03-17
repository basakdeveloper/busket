package com.basak.busket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basak.busket.ItemVO;
import com.basak.busket.ShopVO;
import com.basak.busket.model.Item;
import com.basak.busket.model.Shop;
import com.basak.busket.service.ItemService;
import com.basak.busket.service.ShopService;

@RestController
@CrossOrigin(origins = "*")
public class BusketAPIController {

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping(path="/api/items")
    public List<ItemVO> items() {
		List<Item> items = itemService.getItems();
		
		List<ItemVO> itemVOs = new ArrayList<ItemVO>();
		for (Item item : items) {
			itemVOs.add(new ItemVO(item));
		}
		
		return itemVOs;
    }
	
	@RequestMapping(path="/api/shops")
    public List<ShopVO> shops() {
		List<Shop> shops = shopService.getShops();
		
		List<ShopVO> shopVOs = new ArrayList<ShopVO>();
		for (Shop shop : shops) {
			shopVOs.add(new ShopVO(shop, false));
		}
		
		return shopVOs;
    }
	
	@RequestMapping(path="/api/shopsWithItems")
	public List<ShopVO> shopsWithItems() {
		List<Shop> shops = shopService.getShops();
		
		List<ShopVO> shopVOs = new ArrayList<ShopVO>();
		for (Shop shop : shops) {
			shopVOs.add(new ShopVO(shop, true));
		}
		
		return shopVOs;
	}
}

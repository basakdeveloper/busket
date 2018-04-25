package com.basak.busket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basak.busket.ItemVO;
import com.basak.busket.ShopVO;
import com.basak.busket.dto.shoppinglist.ShopDTO;
import com.basak.busket.model.shoppinglist.Item;
import com.basak.busket.model.shoppinglist.Shop;
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
    public List<ShopDTO> shops() {
		List<ShopDTO> shops = shopService.getShops();		
		return shops;
    }
	
	@RequestMapping(path="/api/shopsWithItems")
	public List<ShopDTO> shopsWithItems() {
		List<ShopDTO> shops = shopService.getShops();		
		return shops;
	}
	
	@RequestMapping(value = "/api/items/add", method = RequestMethod.POST)
	public ResponseEntity<String> addItem(@RequestBody ItemVO itemVO) {
		Item item = new Item(itemVO);
		item.setShop(shopService.getShop(itemVO.getShop().getId()));
		
		itemService.saveItem(item);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}

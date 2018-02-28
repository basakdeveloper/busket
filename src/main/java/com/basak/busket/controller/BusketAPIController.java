package com.basak.busket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basak.busket.ItemVO;
import com.basak.busket.model.Item;
import com.basak.busket.service.ItemService;

@RestController
public class BusketAPIController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(path="/api/items")
    public List<ItemVO> items() {
		List<Item> items = itemService.getItems();
		
		List<ItemVO> itemVOs = new ArrayList<ItemVO>();
		for (Item item : items) {
			itemVOs.add(new ItemVO(item));
		}
		
		return itemVOs;
    }
}

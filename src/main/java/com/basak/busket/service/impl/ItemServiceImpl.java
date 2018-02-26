package com.basak.busket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.busket.model.Item;
import com.basak.busket.repository.ItemRepository;
import com.basak.busket.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void saveItem(Item item) {
		itemRepository.save(item);
	}
	
	@Override
	public List<Item> getItems() {
		return itemRepository.findAll();
	}

	@Override
	public void deleteItem(int itemId) {
		itemRepository.delete(itemId);
	}
	
}

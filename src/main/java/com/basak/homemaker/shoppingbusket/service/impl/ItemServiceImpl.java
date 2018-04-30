package com.basak.homemaker.shoppingbusket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.homemaker.shoppingbusket.dto.ItemDTO;
import com.basak.homemaker.shoppingbusket.dtomapper.ItemDTOMapper;
import com.basak.homemaker.shoppingbusket.model.Item;
import com.basak.homemaker.shoppingbusket.repository.ItemRepository;
import com.basak.homemaker.shoppingbusket.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private ItemDTOMapper itemDTOMapper;
	
	@Override
	public void saveItem(ItemDTO itemDTO) {
		Item item = itemDTOMapper.itemDTOToItem(itemDTO);
		itemRepository.save(item);
	}
	
	@Override
	public void deleteItem(int itemId) {
		itemRepository.delete(itemId);
	}
	
}

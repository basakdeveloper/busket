package com.basak.homemaker.shoppingbusket.dtomapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.basak.homemaker.shoppingbusket.dto.ItemDTO;
import com.basak.homemaker.shoppingbusket.model.Item;

@Mapper(componentModel = "spring", uses = { ShopDTOMapper.class })
public interface ItemDTOMapper {

	@Mapping(target = "shop", ignore = true)
	ItemDTO itemToItemDTO(Item item);
	
	Item itemDTOToItem(ItemDTO itemDTO);

}

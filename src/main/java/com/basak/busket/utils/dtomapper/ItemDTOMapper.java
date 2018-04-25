package com.basak.busket.utils.dtomapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.basak.busket.dto.shoppinglist.ItemDTO;
import com.basak.busket.model.shoppinglist.Item;

@Mapper(componentModel = "spring", uses = { ShopDTOMapper.class })
public interface ItemDTOMapper {

//	@InheritInverseConfiguration
//	ItemDTO itemToItemDTO(Item item, @Context CycleAvoidingMappingContext context);
	
	@Mapping(target = "shop", ignore = true)
	ItemDTO itemToItemDTO(Item item);

}

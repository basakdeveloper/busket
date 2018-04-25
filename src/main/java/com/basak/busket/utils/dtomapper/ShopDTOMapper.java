package com.basak.busket.utils.dtomapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.basak.busket.dto.shoppinglist.ShopDTO;
import com.basak.busket.model.shoppinglist.Shop;

@Mapper(componentModel="spring", uses = { ItemDTOMapper.class })
public interface ShopDTOMapper {

//	@InheritInverseConfiguration
//	ShopDTO shopToShopDTO(Shop shop, @Context CycleAvoidingMappingContext context);
	ShopDTO shopToShopDTO(Shop shop);
	
//	@InheritInverseConfiguration
//	List<ShopDTO> shopsToShopDTOs(List<Shop> shops, @Context CycleAvoidingMappingContext context);
	List<ShopDTO> shopsToShopDTOs(List<Shop> shops);

}

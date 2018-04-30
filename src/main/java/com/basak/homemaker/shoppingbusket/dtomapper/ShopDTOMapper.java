package com.basak.homemaker.shoppingbusket.dtomapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.basak.homemaker.shoppingbusket.dto.ShopDTO;
import com.basak.homemaker.shoppingbusket.model.Shop;

@Mapper(componentModel="spring", uses = { ItemDTOMapper.class })
public interface ShopDTOMapper {

	ShopDTO shopToShopDTO(Shop shop);
	
	List<ShopDTO> shopsToShopDTOs(List<Shop> shops);
	
	Shop shopDTOToShop(ShopDTO shopDTO);

}

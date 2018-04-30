package com.basak.homemaker.shoppingbusket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basak.homemaker.shoppingbusket.model.Item;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
}

package com.basak.busket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basak.busket.model.shoppinglist.Item;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
}

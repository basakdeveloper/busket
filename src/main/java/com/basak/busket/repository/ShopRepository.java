package com.basak.busket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basak.busket.model.shoppinglist.Shop;

@Repository("shopRepository")
public interface ShopRepository extends JpaRepository<Shop, Integer> {
	
	Shop findById(int Id);

}

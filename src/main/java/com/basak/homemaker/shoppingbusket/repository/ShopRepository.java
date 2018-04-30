package com.basak.homemaker.shoppingbusket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basak.homemaker.shoppingbusket.model.Shop;

@Repository("shopRepository")
public interface ShopRepository extends JpaRepository<Shop, Integer> {
	
	Shop findById(int Id);

}

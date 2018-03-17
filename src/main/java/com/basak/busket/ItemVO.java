package com.basak.busket;

import com.basak.busket.model.Item;

public class ItemVO {

	private int id;
	
	private String name;
	
	private ShopVO shopVO;

	public ItemVO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ItemVO(Item item) {
		this.id = item.getId();
		this.name = item.getName();
		this.shopVO = new ShopVO(item.getShop(), false);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ShopVO getShopVO() {
		return shopVO;
	}

	public void setShopVO(ShopVO shopVO) {
		this.shopVO = shopVO;
	}
}

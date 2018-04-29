package com.basak.busket.dto.expense;

import java.io.Serializable;

public class ExpenseCategoryDTO implements Serializable {

	private static final long serialVersionUID = 6994858193128136469L;

	private int id;
	
	private String categoryName;
	
	private String subCategoryName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

}

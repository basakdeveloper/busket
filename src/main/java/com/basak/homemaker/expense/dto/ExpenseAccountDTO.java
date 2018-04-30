package com.basak.homemaker.expense.dto;

import java.io.Serializable;

public class ExpenseAccountDTO implements Serializable {

	private static final long serialVersionUID = -820789827591605151L;

	private int id;
	
	private String name;

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

}

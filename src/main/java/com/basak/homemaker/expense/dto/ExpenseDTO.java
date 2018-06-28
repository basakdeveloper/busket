package com.basak.homemaker.expense.dto;

import java.io.Serializable;
import java.util.Date;

public class ExpenseDTO implements Serializable {

	private static final long serialVersionUID = -2728418200696094851L;
	
	private int id;
	
	private String description;
	
	private Date date;
	
	private ExpenseCategoryDTO expenseCategory;

	private ExpenseAccountDTO expenseAccount;
	
	private double amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ExpenseCategoryDTO getExpenseCategory() {
		return expenseCategory;
	}

	public void setExpenseCategory(ExpenseCategoryDTO expenseCategory) {
		this.expenseCategory = expenseCategory;
	}

	public ExpenseAccountDTO getExpenseAccount() {
		return expenseAccount;
	}

	public void setExpenseAccount(ExpenseAccountDTO expenseAccount) {
		this.expenseAccount = expenseAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}

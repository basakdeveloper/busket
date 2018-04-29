package com.basak.busket.service;

import java.util.List;

import com.basak.busket.dto.expense.ExpenseDTO;

public interface ExpenseService {

	public void saveExpense(ExpenseDTO expenseDTO);
	
	public List<ExpenseDTO> getAllExpenses();
	
}


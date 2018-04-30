package com.basak.homemaker.expense.service;

import java.util.List;

import com.basak.homemaker.expense.dto.ExpenseDTO;

public interface ExpenseService {

	public void saveExpense(ExpenseDTO expenseDTO);
	
	public List<ExpenseDTO> getAllExpenses();
	
}


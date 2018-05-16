package com.basak.homemaker.expense.service;

import java.util.List;

import com.basak.homemaker.expense.dto.ExpenseAccountDTO;
import com.basak.homemaker.expense.dto.ExpenseCategoryDTO;
import com.basak.homemaker.expense.dto.ExpenseDTO;

public interface ExpenseService {

	public void saveExpense(ExpenseDTO expenseDTO);
	
	public List<ExpenseDTO> getAllExpenses();
	
	public List<ExpenseCategoryDTO> getAllExpenseCategories();
	
	public List<ExpenseAccountDTO> getAllExpenseAccounts();
	
}


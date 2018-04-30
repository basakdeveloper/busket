package com.basak.homemaker.expense.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.homemaker.expense.dto.ExpenseDTO;
import com.basak.homemaker.expense.dtomapper.ExpenseDTOMapper;
import com.basak.homemaker.expense.model.Expense;
import com.basak.homemaker.expense.repository.ExpenseRepository;
import com.basak.homemaker.expense.service.ExpenseService;

@Service("expenseService")
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@Autowired
	private ExpenseDTOMapper expenseDTOMapper;
	
	@Override
	public void saveExpense(ExpenseDTO expenseDTO) {
		Expense expense = expenseDTOMapper.expenseDTOToExpense(expenseDTO);
		expenseRepository.save(expense);
	}

	@Override
	public List<ExpenseDTO> getAllExpenses() {
		List<Expense> expenses = expenseRepository.findAll();

		List<ExpenseDTO> expenseDTOs = expenseDTOMapper.expensesToExpenseDTOs(expenses);
		return expenseDTOs;
	}

}

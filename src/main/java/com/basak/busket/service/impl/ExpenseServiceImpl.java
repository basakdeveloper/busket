package com.basak.busket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.busket.dto.expense.ExpenseDTO;
import com.basak.busket.model.expense.Expense;
import com.basak.busket.repository.expense.ExpenseRepository;
import com.basak.busket.service.ExpenseService;
import com.basak.busket.utils.dtomapper.expense.ExpenseDTOMapper;

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

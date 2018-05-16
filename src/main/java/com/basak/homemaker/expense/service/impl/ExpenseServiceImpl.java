package com.basak.homemaker.expense.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basak.homemaker.expense.dto.ExpenseAccountDTO;
import com.basak.homemaker.expense.dto.ExpenseCategoryDTO;
import com.basak.homemaker.expense.dto.ExpenseDTO;
import com.basak.homemaker.expense.dtomapper.ExpenseAccountDTOMapper;
import com.basak.homemaker.expense.dtomapper.ExpenseCategoryDTOMapper;
import com.basak.homemaker.expense.dtomapper.ExpenseDTOMapper;
import com.basak.homemaker.expense.model.Expense;
import com.basak.homemaker.expense.model.ExpenseAccount;
import com.basak.homemaker.expense.model.ExpenseCategory;
import com.basak.homemaker.expense.repository.ExpenseAccountRepository;
import com.basak.homemaker.expense.repository.ExpenseCategoryRepository;
import com.basak.homemaker.expense.repository.ExpenseRepository;
import com.basak.homemaker.expense.service.ExpenseService;

@Service("expenseService")
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	@Autowired
	private ExpenseAccountRepository expenseAccountRepository;
	
	@Autowired
	private ExpenseCategoryRepository expenseCategoryRepository;
	
	@Autowired
	private ExpenseDTOMapper expenseDTOMapper;
	
	@Autowired
	private ExpenseCategoryDTOMapper expenseCategoryDTOMapper;

	@Autowired
	private ExpenseAccountDTOMapper expenseAccountDTOMapper;
	
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

	@Override
	public List<ExpenseCategoryDTO> getAllExpenseCategories() {
		List<ExpenseCategory> expenseCategories = expenseCategoryRepository.findAll();
		
		List<ExpenseCategoryDTO> expenseCategoryDTOs = expenseCategoryDTOMapper.expenseCategoriesToExpenseCategoryDTOs(expenseCategories);
		return expenseCategoryDTOs;
	}

	@Override
	public List<ExpenseAccountDTO> getAllExpenseAccounts() {
		List<ExpenseAccount> expenseAccounts = expenseAccountRepository.findAll();
		
		List<ExpenseAccountDTO> expenseAccountDTOs = expenseAccountDTOMapper.expenseAccountsToExpenseAccountDTOs(expenseAccounts);
		return expenseAccountDTOs;
	}

}

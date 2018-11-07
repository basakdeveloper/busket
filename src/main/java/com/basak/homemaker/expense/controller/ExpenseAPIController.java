package com.basak.homemaker.expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basak.homemaker.expense.dto.ExpenseAccountDTO;
import com.basak.homemaker.expense.dto.ExpenseCategoryDTO;
import com.basak.homemaker.expense.dto.ExpenseDTO;
import com.basak.homemaker.expense.service.ExpenseService;

@RestController
public class ExpenseAPIController {

	@Autowired
	private ExpenseService expenseService;

//	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	@RequestMapping(path="/api/expenses")
    public List<ExpenseDTO> expenses() {
		List<ExpenseDTO> expenses = expenseService.getAllExpenses();
		
//		Map<String, List<ExpenseDTO>> expenseVal = new HashMap<>();
//		expenseVal.put("data", expenses);
		return expenses;
    }

	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	@RequestMapping(value = "/api/expense/add", method = RequestMethod.POST)
	public ResponseEntity<String> addExpense(@RequestBody ExpenseDTO expenseDTO) {
		expenseService.saveExpense(expenseDTO);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	@RequestMapping(path="/api/expense/accounts")
    public List<ExpenseAccountDTO> getExpenseAccounts() {
		List<ExpenseAccountDTO> expenseAccounts = expenseService.getAllExpenseAccounts();
		return expenseAccounts;
	}
	
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	@RequestMapping(path="/api/expense/categories")
    public List<ExpenseCategoryDTO> getExpenseCategories() {
		List<ExpenseCategoryDTO> expenseCategories = expenseService.getAllExpenseCategories();
		return expenseCategories;
	}
}

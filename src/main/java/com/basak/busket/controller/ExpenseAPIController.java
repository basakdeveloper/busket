package com.basak.busket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basak.busket.ItemVO;
import com.basak.busket.dto.expense.ExpenseDTO;
import com.basak.busket.model.shoppinglist.Item;
import com.basak.busket.service.ExpenseService;

@RestController
@CrossOrigin(origins = "*")
public class ExpenseAPIController {

	@Autowired
	private ExpenseService expenseService;

	@RequestMapping(path="/api/expenses")
    public List<ExpenseDTO> expenses() {
		List<ExpenseDTO> expenses = expenseService.getAllExpenses();
		return expenses;
    }

	@RequestMapping(value = "/api/expenses/add", method = RequestMethod.POST)
	public ResponseEntity<String> addExpense(@RequestBody ExpenseDTO expenseDTO) {
		expenseService.saveExpense(expenseDTO);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}

package com.basak.busket.repository.expense;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basak.busket.model.expense.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Serializable> {

//	@Modifying
//	@Query("insert into Expense (description, date, expenseCategory_id, expenseAccount_id) select :description, :date, :expenseCategoryId, :expenseAccountId from Dual")
//	int saveExpense(String description, Date date, int expenseCategoryId, int expenseAccountId);
	
}

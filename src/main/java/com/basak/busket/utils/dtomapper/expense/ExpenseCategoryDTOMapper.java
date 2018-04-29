package com.basak.busket.utils.dtomapper.expense;

import org.mapstruct.Mapper;

import com.basak.busket.dto.expense.ExpenseAccountDTO;
import com.basak.busket.dto.expense.ExpenseCategoryDTO;
import com.basak.busket.model.expense.ExpenseAccount;
import com.basak.busket.model.expense.ExpenseCategory;

@Mapper(componentModel = "spring")
public interface ExpenseCategoryDTOMapper {

	ExpenseCategoryDTO expenseCategoryToExpenseCategoryDTO(ExpenseCategory expenseCategory);
	
	ExpenseCategory expenseCategoryDTOToExpenseCategory(ExpenseCategoryDTO expenseCategoryDTO);

}

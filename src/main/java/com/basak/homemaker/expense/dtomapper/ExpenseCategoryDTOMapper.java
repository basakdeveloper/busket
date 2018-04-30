package com.basak.homemaker.expense.dtomapper;

import org.mapstruct.Mapper;

import com.basak.homemaker.expense.dto.ExpenseCategoryDTO;
import com.basak.homemaker.expense.model.ExpenseCategory;

@Mapper(componentModel = "spring")
public interface ExpenseCategoryDTOMapper {

	ExpenseCategoryDTO expenseCategoryToExpenseCategoryDTO(ExpenseCategory expenseCategory);
	
	ExpenseCategory expenseCategoryDTOToExpenseCategory(ExpenseCategoryDTO expenseCategoryDTO);

}

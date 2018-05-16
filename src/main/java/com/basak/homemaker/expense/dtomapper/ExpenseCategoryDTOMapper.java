package com.basak.homemaker.expense.dtomapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.basak.homemaker.expense.dto.ExpenseCategoryDTO;
import com.basak.homemaker.expense.model.ExpenseCategory;
import com.basak.homemaker.shoppingbusket.dto.ShopDTO;
import com.basak.homemaker.shoppingbusket.model.Shop;

@Mapper(componentModel = "spring")
public interface ExpenseCategoryDTOMapper {

	ExpenseCategoryDTO expenseCategoryToExpenseCategoryDTO(ExpenseCategory expenseCategory);
	
	List<ExpenseCategoryDTO> expenseCategoriesToExpenseCategoryDTOs(List<ExpenseCategory> expenseCategories);
	
	ExpenseCategory expenseCategoryDTOToExpenseCategory(ExpenseCategoryDTO expenseCategoryDTO);

}

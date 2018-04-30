package com.basak.homemaker.expense.dtomapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.basak.homemaker.expense.dto.ExpenseDTO;
import com.basak.homemaker.expense.model.Expense;

@Mapper(componentModel="spring", uses = { ExpenseAccountDTOMapper.class, ExpenseCategoryDTOMapper.class })
public interface ExpenseDTOMapper {

	ExpenseDTO expenseToExpenseDTO(Expense expense);
	
	List<ExpenseDTO> expensesToExpenseDTOs(List<Expense> expenses);
	
	Expense expenseDTOToExpense(ExpenseDTO expenseDTO);

}

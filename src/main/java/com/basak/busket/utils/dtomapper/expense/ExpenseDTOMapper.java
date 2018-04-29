package com.basak.busket.utils.dtomapper.expense;

import java.util.List;

import org.mapstruct.Mapper;

import com.basak.busket.dto.expense.ExpenseDTO;
import com.basak.busket.model.expense.Expense;

@Mapper(componentModel="spring", uses = { ExpenseAccountDTOMapper.class, ExpenseCategoryDTOMapper.class })
public interface ExpenseDTOMapper {

	ExpenseDTO expenseToExpenseDTO(Expense expense);
	
	List<ExpenseDTO> expensesToExpenseDTOs(List<Expense> expenses);
	
	Expense expenseDTOToExpense(ExpenseDTO expenseDTO);

}

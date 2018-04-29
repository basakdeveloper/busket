package com.basak.busket.utils.dtomapper.expense;

import org.mapstruct.Mapper;

import com.basak.busket.dto.expense.ExpenseAccountDTO;
import com.basak.busket.model.expense.ExpenseAccount;

@Mapper(componentModel = "spring")
public interface ExpenseAccountDTOMapper {

	ExpenseAccountDTO expenseAccountToExpenseAccountDTO(ExpenseAccount expenseAccount);
	
	ExpenseAccount expenseAccountDTOToExpenseAccount(ExpenseAccountDTO expenseAccountDTO);

}

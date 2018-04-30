package com.basak.homemaker.expense.dtomapper;

import org.mapstruct.Mapper;

import com.basak.homemaker.expense.dto.ExpenseAccountDTO;
import com.basak.homemaker.expense.model.ExpenseAccount;

@Mapper(componentModel = "spring")
public interface ExpenseAccountDTOMapper {

	ExpenseAccountDTO expenseAccountToExpenseAccountDTO(ExpenseAccount expenseAccount);
	
	ExpenseAccount expenseAccountDTOToExpenseAccount(ExpenseAccountDTO expenseAccountDTO);

}

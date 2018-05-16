package com.basak.homemaker.expense.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basak.homemaker.expense.model.ExpenseCategory;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Serializable> {

}

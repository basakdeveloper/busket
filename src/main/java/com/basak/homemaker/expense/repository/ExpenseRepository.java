package com.basak.homemaker.expense.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basak.homemaker.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Serializable> {

}

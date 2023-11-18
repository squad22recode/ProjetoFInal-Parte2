package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaoCash.model.Expense;

public interface ExpenseRespository extends JpaRepository<Expense, Long> {

}

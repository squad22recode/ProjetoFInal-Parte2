package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoCash.model.Expense;

@Repository
public interface ExpenseRespository extends JpaRepository<Expense, Long> {

}

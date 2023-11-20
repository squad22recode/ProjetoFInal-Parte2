package com.gestaoCash.services;

import java.util.List;

import com.gestaoCash.model.Expense;

public interface ExpenseService {
  void saveExpense(Expense expense);

  List<Expense> findAllExpense();

  Expense findExpenseById(Long id);

  void updateExpenseById(Long id, Expense updatedExpense);

  void deleteExpenseById(Long id);
}

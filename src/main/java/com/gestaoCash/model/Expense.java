package com.gestaoCash.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity(name = "despesa_usuario")
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String descricao;

  @Column(columnDefinition = "DATETIME")
  private LocalDateTime data;

  private String observacao;

  @Column(columnDefinition = "DECIMAL(10,2)")
  private Double valor;
}

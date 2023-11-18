package com.gestaoCash.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;

public class Revenue {

  private Long id;

  private String descricao;
  private String observacao;

  @DateTimeFormat(iso = ISO.DATE)
  private LocalDate data;

  @Column(columnDefinition = "DECIMAL(10,2)")
  private Double valor;

  private String formaPagamento;

}

package com.gestaoCash.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table
@Entity(name = "despesa_usuario")
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // muitas despesas( essa classe) para um usuario (private Users usuario)
  // @ManyToOne
//  @ManyToOne(cascade = CascadeType.PERSIST)
//  @JoinColumn(name = "usuario_id", referencedColumnName = "id")
  @JoinColumn(foreignKey = @ForeignKey(name = "usuario_id"))
  @ManyToOne
  private Users usuario;

  private String categoria;

  public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

@DateTimeFormat(iso = ISO.DATE)
  private LocalDate data;

  private String observacao;

  @Column(columnDefinition = "DECIMAL(10,2)")
  private Double valor;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Users getUsuario() {
    return usuario;
  }

  public void setUsuario(Users usuario) {
    this.usuario = usuario;
  }



  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

}

package com.gestaoCash.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "cliente")
@Entity
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, columnDefinition = "CHAR(11)")
  private String cpf;

  @Column(columnDefinition = "varchar(50)")
  private String nome;

  @DateTimeFormat(iso = ISO.DATE)
  private LocalDate dataNascimento;

  @Column(columnDefinition = "varchar(11)")
  private String telefone;

  @Column(unique = true, columnDefinition = "VARCHAR(50)")
  private String email;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "endereco_id", referencedColumnName = "id")
  private Address endereco;

  public Client() {

  }

  public Client(Long id, String cpf, String nome, LocalDate dataNascimento, String telefone, String email,
      String endereco,
      String complemento) {
    this.id = id;
    this.cpf = cpf;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.telefone = telefone;
    this.email = email;

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Address getEndereco() {
    return endereco;
  }

  public void setEndereco(Address endereco) {
    this.endereco = endereco;
  }

}
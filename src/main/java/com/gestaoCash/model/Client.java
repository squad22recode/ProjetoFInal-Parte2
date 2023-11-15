package com.gestaoCash.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

  private Date dataNascimento;

  @Column(columnDefinition = "varchar(11)")
  private String telefone;

  @Column(unique = true, columnDefinition = "VARCHAR(50)")
  private String email;

  @Column(columnDefinition = "VARCHAR(100)")
  private String endereco;

  @Column(columnDefinition = "VARCHAR(100)")
  private String complemento;

  public Client() {

  }

  public Client(Long id, String cpf, String nome, Date dataNascimento, String telefone, String email, String endereco,
      String complemento) {
    this.id = id;
    this.cpf = cpf;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.telefone = telefone;
    this.email = email;
    this.endereco = endereco;
    this.complemento = complemento;
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

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
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

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  // no momento essa foreign key está estatico, em breve será relacao entre
  // tabelas
  // private Long id_empresa;

}
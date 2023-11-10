package com.gestaoCash.model.client;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "cliente")
@Entity
public class client {

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

  // no momento essa foreign key está estatico, em breve será relacao entre
  // tabelas
  private Long id_empresa;

}

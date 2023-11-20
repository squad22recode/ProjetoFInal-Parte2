package com.gestaoCash.model;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table
@Entity(name = "usuarios")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Address enderecoUsuario;

	@OneToMany(mappedBy = "usuario", orphanRemoval = true, cascade = CascadeType.PERSIST)
	private List<Revenue> revenue = new ArrayList<Revenue>();
	
	@OneToMany(mappedBy = "usuario", orphanRemoval = true, cascade = CascadeType.PERSIST)
	private List<Expense> expense = new ArrayList<Expense>();

	// pode ser unidirecional ou bidirecional
	// um usuario (essa classe) pode ter varias despesas (set<Expense> expenses)
	// @OneToMany(cascade = { CascadeType.PERSIST }, fetch = FetchType.LAZY)
	// private Set<Expense> expenses = new HashSet<>();

	// @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	// private List<Expense> expenses;

	public List<Expense> getExpense() {
		return expense;
	}

	public void setExpense(List<Expense> expense) {
		this.expense = expense;
	}

	public List<Revenue> getRevenue() {
		return revenue;
	}

	public void setRevenue(List<Revenue> revenue) {
		this.revenue = revenue;
	}

	@Column(columnDefinition = "VARCHAR(60)")
	private String senha;

	@Column(columnDefinition = "VARCHAR(5)")
	private String tipoUsuario;

	@Column( columnDefinition = "CHAR(14)")
	private String cpf;

	@Column(columnDefinition = "varchar(50)")
	private String nome;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataNascimento;

	@Column(columnDefinition = "varchar(16)")
	private String telefone;

	@Column( columnDefinition = "VARCHAR(50)")
	private String email;

	@Column(columnDefinition = "longblob")
	private byte[] imagemPerfil;

	@Column(columnDefinition = "CHAR(1)")
	private String sexo;

	@Column(columnDefinition = "VARCHAR(100)")
	private String facebook;
	@Column(columnDefinition = "VARCHAR(100)")
	private String linkedin;
	@Column(columnDefinition = "VARCHAR(100)")
	private String instagram;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getEnderecoUsuario() {
		return enderecoUsuario;
	}

	public void setEnderecoUsuario(Address enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
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

	public byte[] getImagemPerfil() {
		return imagemPerfil;
	}

	public void setImagemPerfil(byte[] imagemPerfil) {
		this.imagemPerfil = imagemPerfil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public static Object withDefaultPasswordEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

}

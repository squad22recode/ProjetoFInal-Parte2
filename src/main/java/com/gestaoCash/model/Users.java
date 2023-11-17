package com.gestaoCash.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "usuarios")
@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@OneToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "endereco_id", referencedColumnName = "id")
//  private AddressUsers endereco;

	@Column(columnDefinition = "VARCHAR(20)")
	private String bairro;

	@Column(columnDefinition = "VARCHAR(9)")
	private String cep;

	@Column(columnDefinition = "VARCHAR(25)")
	private String estado;

	@Column(columnDefinition = "VARCHAR(25)")
	private String cidade;

	@Column(columnDefinition = "VARCHAR(5)")
	private String tipoUsuario;

	@Column(columnDefinition = "VARCHAR(25)")
	private String senha;

	@Column(columnDefinition = "VARCHAR(50)")
	private String endereco;

	@Column(columnDefinition = "VARCHAR(50)")
	private String complemento;

	@Column(unique = true, columnDefinition = "CHAR(14)")
	private String cpf;

	@Column(columnDefinition = "varchar(50)")
	private String nome;

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataNascimento;

	@Column(columnDefinition = "varchar(15)")
	private String telefone;

	@Column(unique = true, columnDefinition = "VARCHAR(50)")
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
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
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


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public AddressUsers getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(AddressUsers endereco) {
//		this.endereco = endereco;
//	}

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

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}

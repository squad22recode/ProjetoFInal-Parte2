package com.gestaoCash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Table(name = "endereco_usuario")
@Entity
public class AddressUsers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//
	// @OneToOne(mappedBy = "endereco")
	// private Users user;

	@Column(columnDefinition = "VARCHAR(20)")
	private String bairro;

	@Column(columnDefinition = "VARCHAR(8)")
	private String cep;

	@Column(columnDefinition = "VARCHAR(25)")
	private String estado;

	@Column(columnDefinition = "VARCHAR(25)")
	private String cidade;

	@Column(columnDefinition = "VARCHAR(50)")
	private String endereco;

	@Column(columnDefinition = "VARCHAR(50)")
	private String complemento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// public Users getUser() {
	// return user;
	// }
	//
	// public void setUser(Users user) {
	// this.user = user;
	// }

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

}

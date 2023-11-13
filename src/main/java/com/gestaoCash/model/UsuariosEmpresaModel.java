package com.gestaoCash.model;

import java.util.Date;

public class UsuariosEmpresaModel {
    private String cpf;
    private String apelido;
    private String sexo;
    private Date dataNascimento;
    private String idUsuario;
    private String nomeUsuario;
    private String facebook;
    private String instagram;
    private String linkedin;
    private String email;
    private String enderecoUsuario;
    private String nomeEmpresa;
    private int idEmpresa;
    private String cnpj;
    private String razaoSocial;

    public UsuariosEmpresaModel(String cpf, String apelido, String sexo, Date dataNascimento, String idUsuario, String nomeUsuario, String facebook, String instagram, String linkedin, String email, String enderecoUsuario, String nomeEmpresa, int idEmpresa, String cnpj, String razaoSocial) {
        this.cpf = cpf;
        this.apelido = apelido;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.facebook = facebook;
        this.instagram = instagram;
        this.linkedin = linkedin;
        this.email = email;
        this.enderecoUsuario = enderecoUsuario;
        this.nomeEmpresa = nomeEmpresa;
        this.idEmpresa = idEmpresa;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}

package com.gestaoCash.model;

import java.util.Date;

public class UsuarioModel {
    private String cpf;
    private String apelido;
    private String sexo;
    private Date dataNascimento;
    private String idUsuario;
    private String nomeUsuario;
    private String enderecoUsuario;
    private int idEmpresa;

    public UsuarioModel(String cpf, String apelido, String sexo, Date dataNascimento, String idUsuario, String nomeUsuario, String enderecoUsuario, int idEmpresa) {
        this.cpf = cpf;
        this.apelido = apelido;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.idEmpresa = idEmpresa;
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

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}

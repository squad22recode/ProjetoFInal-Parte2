package com.gestaoCash.model;

import java.util.Date;

public class ReceitaUsuarioModel {
    private String formaDePagamento;
    private Date data;
    private double valor;
    private String descricao;
    private int id;
    private int idUsuario;
    private int idEmpresa;

    public ReceitaUsuarioModel(String formaDePagamento, Date data, double valor, String descricao, int id, int idUsuario, int idEmpresa) {
        this.formaDePagamento = formaDePagamento;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.id = id;
        this.idUsuario = idUsuario;
        this.idEmpresa = idEmpresa;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}

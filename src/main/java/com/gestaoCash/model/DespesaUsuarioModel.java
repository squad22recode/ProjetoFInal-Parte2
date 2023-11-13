package com.gestaoCash.model;

import java.util.Date;

public class DespesaUsuarioModel {
    private String descricao;
    private int id;
    private Date data;
    private String observacao;
    private double valor;
    private int idUsuario;
    private int idEmpresa;

    public DespesaUsuarioModel(String descricao, int id, Date data, String observacao, double valor, int idUsuario, int idEmpresa) {
        this.descricao = descricao;
        this.id = id;
        this.data = data;
        this.observacao = observacao;
        this.valor = valor;
        this.idUsuario = idUsuario;
        this.idEmpresa = idEmpresa;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

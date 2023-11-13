package com.gestaoCash.model;

public class DespesasEmpresaModel {
    private int id;
    private double valor;
    private String descricao;
    private String observacao;
    private int idCliente;
    private int idEmpresa;

    public DespesasEmpresaModel(int id, double valor, String descricao, String observacao, int idCliente, int idEmpresa) {
        this.id = id;
        this.valor = valor;
        this.descricao = descricao;
        this.observacao = observacao;
        this.idCliente = idCliente;
        this.idEmpresa = idEmpresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}

package com.gestaoCash.model;

public class EnderecoEmpresaModel {
    private String cepEmpresa;
    private int id;
    private String ruaEmpresa;
    private int numeroEmpresa;
    private String estadoEmpresa;
    private String bairroEmpresa;
    private int idUsuario;
    private int idEmpresa;

    public EnderecoEmpresaModel(String cepEmpresa, int id, String ruaEmpresa, int numeroEmpresa, String estadoEmpresa, String bairroEmpresa, int idUsuario, int idEmpresa) {
        this.cepEmpresa = cepEmpresa;
        this.id = id;
        this.ruaEmpresa = ruaEmpresa;
        this.numeroEmpresa = numeroEmpresa;
        this.estadoEmpresa = estadoEmpresa;
        this.bairroEmpresa = bairroEmpresa;
        this.idUsuario = idUsuario;
        this.idEmpresa = idEmpresa;
    }

    public String getCepEmpresa() {
        return cepEmpresa;
    }

    public void setCepEmpresa(String cepEmpresa) {
        this.cepEmpresa = cepEmpresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuaEmpresa() {
        return ruaEmpresa;
    }

    public void setRuaEmpresa(String ruaEmpresa) {
        this.ruaEmpresa = ruaEmpresa;
    }

    public int getNumeroEmpresa() {
        return numeroEmpresa;
    }

    public void setNumeroEmpresa(int numeroEmpresa) {
        this.numeroEmpresa = numeroEmpresa;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public String getBairroEmpresa() {
        return bairroEmpresa;
    }

    public void setBairroEmpresa(String bairroEmpresa) {
        this.bairroEmpresa = bairroEmpresa;
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

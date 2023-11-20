package com.gestaoCash.model;

public class EnderecoUsuarioModel {
    private String estadoUsuario;
    private String bairroUsuario;
    private int id;
    private String cepUsuario;
    private String ruaUsuario;
    private int numeroUsuario;
    private int idUsuario;
    private int idEmpresa;

    public EnderecoUsuarioModel(String estadoUsuario, String bairroUsuario, int id, String cepUsuario, String ruaUsuario, int numeroUsuario, int idUsuario, int idEmpresa) {
        this.estadoUsuario = estadoUsuario;
        this.bairroUsuario = bairroUsuario;
        this.id = id;
        this.cepUsuario = cepUsuario;
        this.ruaUsuario = ruaUsuario;
        this.numeroUsuario = numeroUsuario;
        this.idUsuario = idUsuario;
        this.idEmpresa = idEmpresa;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getBairroUsuario() {
        return bairroUsuario;
    }

    public void setBairroUsuario(String bairroUsuario) {
        this.bairroUsuario = bairroUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCepUsuario() {
        return cepUsuario;
    }

    public void setCepUsuario(String cepUsuario) {
        this.cepUsuario = cepUsuario;
    }

    public String getRuaUsuario() {
        return ruaUsuario;
    }

    public void setRuaUsuario(String ruaUsuario) {
        this.ruaUsuario = ruaUsuario;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
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

package com.gestaoCash.model;

public class CursosModel {
    private int id;
    private String nomeDoCurso;
    private String url;
    private String descricao;

    public CursosModel(int id, String nomeDoCurso, String url, String descricao) {
        this.id = id;
        this.nomeDoCurso = nomeDoCurso;
        this.url = url;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

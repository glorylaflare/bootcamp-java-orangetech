package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    
    //Constante
    public static final double XP_PADRAO = 10d;
    //Atributos
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

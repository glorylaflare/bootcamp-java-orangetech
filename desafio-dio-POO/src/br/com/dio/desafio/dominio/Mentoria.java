package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //Atributos
    private LocalDate data;
    
    //Metodo calcularXp
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //Constructor
    public Mentoria() {
        
    }

    //Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Método toString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

}

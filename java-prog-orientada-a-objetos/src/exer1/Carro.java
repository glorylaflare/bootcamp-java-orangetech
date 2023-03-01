package exer1;

class Carro {

    String cor;
    String modelo;
    int ano;
    int capacidadeTanque;

    //Constructor
    Carro() {

    }

    Carro(String cor, String modelo, int ano, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Getters e Setters
    //Cor
    void setCor(String cor) {
        this.cor = cor;
    }
     String getCor() {
        return cor;
     }

     //Modelo
     void setModelo(String modelo) {
        this.modelo = modelo;
     }
     String getModelo() {
        return modelo;
     }

     //Ano
     void setAno(int ano) {
        this.ano = ano;
     }
     int getAno() {
        return ano;
     }

     //Capacidade de Tanque
     void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
     }
     int getCapacidadeTanque() {
        return capacidadeTanque;
     }

     //Calculando
     double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
     }
}

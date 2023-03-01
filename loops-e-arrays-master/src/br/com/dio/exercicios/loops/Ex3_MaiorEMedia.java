package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int soma = 0;
        int media;

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            
            if(numero > maiorNumero) maiorNumero = numero;
            soma = soma + numero;

            count++;
        } while(count < 5);

        media = soma/5;
        System.out.println("Média : " + media);
        System.out.println("Maior número : " + maiorNumero);
    }
}

package carro;

import java.util.Scanner;

public class Carro {

    int quantidadeDePortas;

    String modelo;

    String marca;

    double potencia;

    public Carro(int quantidadeDePortas, String modelo, String marca, double potencia) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public void dadosDoCarro(){
        System.out.println("Esse carro tem " + quantidadeDePortas + " portas");
        System.out.println("Esse carro é um " + modelo + " da " + marca);
        System.out.println("A potência desse carro é: " + potencia);
    }

    Scanner resposta = new Scanner(System.in);

    public void ligarCarro(){
        System.out.println("Você deseja ligar o carro? (digite S para sim e N para não)");
        String simOUnao = resposta.next();

        if (simOUnao.equalsIgnoreCase("S")){
            System.out.println("Você ligou o carro!");
        } else if (simOUnao.equalsIgnoreCase("N")){
            System.out.println("Você não ligou o carro!");
        } else {
            System.out.println("Algo deu errado! Melhor levar o carro no mecânico...");
        }
    }
}

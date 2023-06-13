package bola;

import java.util.Scanner;

public class Bola {

    Double circunferencia;

    String cor;

    String marca;

    String material;

    Double velocidade;

    Scanner resposta = new Scanner(System.in);

    public void trocaCor(){

        System.out.println("Você deseja trocar a cor da bola? (escreva S para sim e N para não)");
        String simOUnao = resposta.nextLine();

        if (simOUnao.equalsIgnoreCase("S")){
            System.out.println("Ok, qual a nova cor da bola?");
            cor = resposta.nextLine();
        } else if (simOUnao.equalsIgnoreCase("N")) {
            System.out.println("Sem problemas!");
        } else{
            System.out.println("Entrada inválida");
        }

    }

    public void mostraCor(){
        System.out.println("A cor atual da bola é: " + cor);
    }
}

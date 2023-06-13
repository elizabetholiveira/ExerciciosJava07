package quadrado;

import java.util.Scanner;

public class Quadrado {


    double lado;

    Scanner resposta = new Scanner(System.in);

    public Double valorDoLado(){
        System.out.println("O valor do lado do quadrado é " + lado);
        return lado;
    }

    public void mudarValorDoLado(){
        valorDoLado();

        System.out.println("Você deseja alterá-lo? (digite S para sim e N para não)");
        String simOUnao = resposta.next();

        if (simOUnao.equalsIgnoreCase("S")){
            System.out.println("Ok, qual é o novo valor do lado do quadrado?");
            lado = resposta.nextDouble();
        }else if (simOUnao.equalsIgnoreCase("N")){
            System.out.println("Ok, não farei nenhuma mudança.");
        }else {
            System.out.println("Entrada inválida. Não farei nenhuma mudança.");
        }

        valorDoLado();
    }

    public void calcularArea(){
        double area = lado * lado;
        System.out.println("A área do quadrado é " + area + "m²");
    }
}

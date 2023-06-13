package retangulo;

import java.util.Scanner;

public class Retangulo {

    Scanner resposta = new Scanner(System.in);

    double ladoA;

    double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double valorDosLados(){
       System.out.println("O lado A mede: " + ladoA + "cm");
       System.out.println("O lado B mede " + ladoB + "cm");
       return ladoA;
   }

    public void mudarValorDosLados(){
        valorDosLados();

        System.out.println("Você deseja mudar o valor dos lados? (digite o número)");
        System.out.println("1 - Sim, de ambos");
        System.out.println("2 - Não, de nenhum");
        System.out.println("3 - Sim, somente do lado A");
        System.out.println("4 - Sim, somente do lado B");
        int selecao = resposta.nextInt();

        switch (selecao){
            case 1:
                System.out.println("Ok, qual o valor do lado A?");
                ladoA = resposta.nextDouble();

                System.out.println("E qual o valor do lado B?");
                ladoB = resposta.nextDouble();
                break;
            case 2:
                System.out.println("Ok, nenhum valor será alterado.");
                break;
            case 3:
                System.out.println("Ok, qual o valor do lado A?");
                ladoA = resposta.nextDouble();
                break;
            case 4:
                System.out.println("Ok, qual o valor do lado B?");
                ladoB = resposta.nextDouble();
                break;
            default:
                System.out.println("Seleção inv[alida. Nenhum valor será alterado.");
        }

        System.out.println();
        valorDosLados();
    }

    public void calcularArea(){
       double area = ladoA * ladoB;
        System.out.println("A área é: " + area + "cm²");
    }

    public void calcularPerimetro(){
       double perimetro = (ladoA * 2) + (ladoB * 2);
        System.out.println("O perímetro mede " + perimetro + "cm");
    }
}

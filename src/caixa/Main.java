package caixa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        System.out.println("Boas vindas ao nosso banco");

        Caixa caixa1 = new Caixa(1000);

        for (int i = 0; i < 2; i++){

            System.out.println();
            System.out.printf("Seu saldo no momento é: R$ %,.2f%n", caixa1.saldo);
            System.out.println();

            System.out.println("Selecione o que deseja fazer (digite o número)");
            System.out.println("1 - Crédito (depositar)");
            System.out.println("2 - Débito (sacar)");
            System.out.println("3 - Sair");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    caixa1.credito();
                    i--;
                    break;
                case 2:
                    caixa1.debito();
                    i--;
                    break;
                case 3:
                    i++;
                    break;
                default:
                    System.out.println("Seleção inválida");
                    System.out.println();
                    i--;
            }
        }

        System.out.println();
        System.out.printf("Seu saldo final é: R$ %,.2f%n", caixa1.saldo);
        System.out.println();
        System.out.println("Tenha um bom dia!");

    }
}

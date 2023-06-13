package contaCorrente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        System.out.println("Boas-vindas ao nosso banco! Por favor preencha as informações abaixo:");

        System.out.println("Qual o número da conta?");
        int entradaNumeroDaConta = resposta.nextInt();

        System.out.println("Qual o nome da correstista?");
        resposta.nextLine();
        String entradaNomeDoCorrentista = resposta.nextLine();

        ContaCorrente correntista1 = new ContaCorrente(entradaNumeroDaConta, entradaNomeDoCorrentista, 0.0);

        System.out.println("Você deseja informar a existência de algum saldo pré-existente? (digite S para sim)");
        String simOUnao = resposta.next();

        if (simOUnao.equalsIgnoreCase("S")){
            System.out.println("Qual é o valor do seu saldo? (números apenas)");
            correntista1.saldo = resposta.nextDouble();
        } else {
            System.out.println("Ok.");
        }

        System.out.printf("O valor do seu saldo é: R$ %,.2f%n", correntista1.saldo);

        System.out.println("O que você deseja fazer hoje? (digite o número)");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Nada");
        int selecao = resposta.nextInt();

        switch (selecao){
            case 1:
                correntista1.depositoConta();
                break;
            case 2:
                correntista1.saqueConta();
                break;
            case 3:
                System.out.println("Tudo bem!");
                break;
        }

        System.out.println("Tenha um bom dia!");
    }
}

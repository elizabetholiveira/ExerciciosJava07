package contaCorrente;

import java.util.Scanner;

public class ContaCorrente {

    Scanner resposta = new Scanner(System.in);

    int numeroDaConta;

    String nomeDoCorrentista;

    Double saldo;

    public ContaCorrente(int numeroDaConta, String nomeDoCorrentista, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
    }

    public void depositoConta(){
        System.out.println("Qual é o valor que deseja depositar?");
        double valorDepositado = resposta.nextDouble();
        saldo = saldo + valorDepositado;
        System.out.printf("Seu saldo agora é de: R$ %,.2f%n", saldo);
    }

    public void saqueConta(){
        System.out.println("Qual é o valor que deseja sacar?");
        double valorSacado = resposta.nextDouble();

        if (saldo >= valorSacado) {
            saldo = saldo - valorSacado;
            System.out.printf("Seu saldo agora é de: R$ %,.2f%n", saldo);
        } if (saldo < valorSacado){
            System.out.println("Você não tem dinheiro o suficiente para completar essa transação.");
        }
    }
}

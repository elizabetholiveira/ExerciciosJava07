package caixa;

import java.util.Scanner;

public class Caixa {

    double saldo;

    public Caixa(double saldo) {
        this.saldo = saldo;
    }

    double credito;

    double debito;

    Scanner resposta = new Scanner(System.in);

    public void debito(){
        System.out.println("Quanto você deseja retirar?");
        debito = resposta.nextDouble();
        saldo = saldo - debito;
        System.out.println();
    }

    public void credito(){
        System.out.println("Quanto você deseja depositar?");
        credito = resposta.nextDouble();
        saldo = saldo + credito;
        System.out.println();
    }
}

package carro;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro(4, "Celta", "Chevrolet", 2.0);

        System.out.println("Vou te apresentar um carro!");

        carro1.dadosDoCarro();

        carro1.ligarCarro();

        System.out.println("Tenha um bom dia!");
    }
}

package bola;

public class Main {

    public static void main(String[] args) {

        Bola bola1 = new Bola();

        bola1.circunferencia = 1.5;
        bola1.cor = "amarelo";
        bola1.marca = "adidas";
        bola1.material = "borracha";
        bola1.velocidade = 2.0;

        bola1.trocaCor();

        bola1.mostraCor();
    }
}

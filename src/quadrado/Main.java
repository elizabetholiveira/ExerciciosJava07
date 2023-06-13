package quadrado;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado();

        quadrado1.lado = 2;

        System.out.println("Olá, aqui eu tenho um quadrado.");

        quadrado1.mudarValorDoLado();

        quadrado1.calcularArea();

        System.out.println("Tenha um bom dia!");
    }
}

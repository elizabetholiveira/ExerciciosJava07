package retangulo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Olá! Aqui eu tenho um retângulo!");

        Retangulo retangulo1 = new Retangulo(2, 4);

        retangulo1.mudarValorDosLados();

        System.out.println();

        retangulo1.calcularPerimetro();

        System.out.println();

        retangulo1.calcularArea();

        System.out.println();
        System.out.println("Tenha um bom dia!");
    }
}

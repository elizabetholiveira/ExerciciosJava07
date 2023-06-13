package pessoa;

import java.util.Scanner;

public class Pessoa {

    String nome;

    Integer idade;

    Double peso;

    Double altura;

    Scanner resposta = new Scanner(System.in);

    public void pegarDados(){
        System.out.println("Qual o nome da pessoa?");
        nome = resposta.nextLine();

        System.out.println("Qual a idade da pessoa? (apenas números)");
        idade = resposta.nextInt();

        System.out.println("Você deseja inserir o peso da pessoa? (S para sim e N para não)");
        String simOUnao = resposta.next();

        if (simOUnao.equalsIgnoreCase("S")) {
            System.out.println("Ok, qual o peso da pessoa? (apenas números)");
            peso = resposta.nextDouble();
        } else if (simOUnao.equalsIgnoreCase("N")) {
            System.out.println("Ok, o peso por padrão vai ficar como 0(zero)");
            peso = 0.0;
        } else {
            System.out.println("Opa! Entrada inválida! O peso por padrão vai ficar como 0(zero)");
            peso = 0.0;
        }

        System.out.println("Qual a altura da pessoa? (apenas números)");
        altura = resposta.nextDouble();
    }

    public void exibirDados(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade);
        System.out.println("Peso da pessoa: " + peso);
        System.out.println("Altura da pessoa: " + altura);
    }

    public void fazerEnvelhecer(){
        System.out.println("Aqui vamos ver o que vai acontecer com essa pessoa com o passar dos anos!");

        System.out.println("Quantos anos você quer que se passem?");
        int anos = resposta.nextInt();

        for (int i = 0; i < anos; i++){
            if (idade < 21){
                System.out.println("Esse é o " + (i + 1) + "º ano:");
                System.out.println("A pessoa envelheceu!");
                idade = idade + 1;
                System.out.println("A idade atual da pessoa é: " + idade);
                System.out.println("A pessoa cresceu!");
                altura = altura + 0.005;
                System.out.printf("A altura atual da pessoa é: %.2f%n", altura);

                System.out.println("----------");
            } if (idade >= 21){
                System.out.println("Esse é o " + (i + 1) + "º ano:");
                System.out.println("A pessoa envelheceu!");
                idade = idade + 1;
                System.out.println("A idade atual da pessoa é: " + idade);

                System.out.println("----------");
            } if (idade == 100){
                System.out.println("Esse é o " + (i + 1) + "º ano:");
                System.out.println("a pessoa está morta");
                System.out.println("----------");
            }
        }
    }

    public void fazerEngordar(){
        System.out.println("Aqui você vai me dizer o pessoa final da pessoa e eu direi o quanto ela engordou!");
        System.out.println("Qual o peso final da pessoa?");
        Double pesoFinalEngordar = resposta.nextDouble();

        Double engordar = pesoFinalEngordar - peso;
        System.out.println("A pessoa engordou " + engordar + " quilos!");
    }

    public void fazerEmagrecer(){
        System.out.println("Aqui você vai me dizer o peso final da pessoa e eu direi o quanto ela emagreceu!");
        System.out.println("Qual o peso final da pessoa?");
        Double pesoFinalEmagrecer = resposta.nextDouble();

        Double emagrecer = peso - pesoFinalEmagrecer;
        System.out.println("A pessoa emagreceu " + emagrecer + " quilos!");
    }

    public void fazerCrescer(){
        System.out.println("Aqui você vai me dizer a altura final da pessoa e eu direi o quanto ela cresceu!");
        System.out.println("Qual a altura final da pessoa?");
        Double alturaFinal = resposta.nextDouble();

        Double crescer = alturaFinal - altura;
        System.out.println("A pessoa cresceu " + altura + " metros!");
    }
}

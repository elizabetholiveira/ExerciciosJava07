package pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        System.out.println("Olá! Eu tenho uma pessoa aqui e quero que você defina quais são os dados dela! Vamos lá?");

        pessoa1.pegarDados();

        pessoa1.exibirDados();

        System.out.println("Muito obrigado pela sua ajuda!");

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("O que vai acontecer com essa pessoa agora? Selecione o que você quer fazer com ela! (digite o número)");
        System.out.println("1 - Envelhecer");
        System.out.println("2 - Engordar");
        System.out.println("3 - Emagrecer");
        System.out.println("4 - Crescer");
        int selecao = resposta.nextInt();

        switch (selecao){
            case 1:
                pessoa1.fazerEnvelhecer();
                break;
            case 2:
                pessoa1.fazerEngordar();
                break;
            case 3:
                pessoa1.fazerEmagrecer();
                break;
            case 4:
                pessoa1.fazerCrescer();
                break;
            default:
                System.out.println("Opa! Número inválido! Vamos acabar por aqui então!");
        }


        System.out.println();
        System.out.println("Tenha um bom dia!");
    }
}

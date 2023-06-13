package jardinagem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        Jardinagem jardim1 = new Jardinagem();

        System.out.println("Olá! Sou o novo jardinheiro que veio fazer a manutenção do seu jardim! Por favor, preencha os dados abaixo:");

        System.out.println("Qual o nome do seu jardim?");
        jardim1.nomeJardim = resposta.nextLine();

        System.out.println("Esse é um belo nome! Quantas plantas você tem? (digite apenas números)");
        jardim1.qtdPlantas = resposta.nextInt();

        System.out.println("Bastante! Quantos metros quadrados tem o seu jardim? (digite apenas números)");
        jardim1.qtdMetros = resposta.nextDouble();

        System.out.println("Ok. E quanto de metro quadrado tem de grama no seu jardim? (digite apenas números)");
        jardim1.qtdMetrosGrama = resposta.nextDouble();

        jardim1.valorAdubo = 20.00;
        jardim1.valorMetroGrama = 15.00;

        System.out.println("Certo, então os dados do seu jardim são esses:");
        System.out.println("Nome do jardim: " + jardim1.nomeJardim);
        System.out.println("Quantidade de plantas: " + jardim1.qtdPlantas);
        System.out.println("Metros quadrados: " + jardim1.qtdMetros);
        System.out.println("Metros quadrados de grama: " + jardim1.qtdMetrosGrama);

        System.out.println();

        System.out.println("Os meus valores base são os seguintes: ");
        System.out.printf("Valor por saco de adubo(100 gramas): R$%,.2f%n", jardim1.valorAdubo);
        System.out.printf("Valor do corte de grama por metro: R$%,.2f%n", jardim1.valorMetroGrama);

        System.out.println();

        System.out.println("Ou seja, o orçamento final ficou assim:");

        jardim1.usarAdubo();
        jardim1.precoAdubo();
        jardim1.precoCorteGrama();

        System.out.println();
        System.out.println("Podemos fechar o orçamento?");

    }
}

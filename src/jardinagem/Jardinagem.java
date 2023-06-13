package jardinagem;

public class Jardinagem {

    String nomeJardim;

    double qtdMetros;

    int qtdPlantas;

    double qtdMetrosGrama;

    double gramaAdubo;

    double valorAdubo;

    double valorMetroGrama;

    double valorCorteGrama;
    double precoAdubo;

    double usarAdubo;

    public void usarAdubo(){
        gramaAdubo = (100 * qtdMetrosGrama) / 2;
        usarAdubo = gramaAdubo/100;
        System.out.println("Para o tamanho do seu jardim, serão necessários " + gramaAdubo + " gramas de adubo.");
    }

    public void precoAdubo(){
        precoAdubo = usarAdubo * valorAdubo;
        System.out.printf("O preço do adubo necessário é: R$%,.2f%n", precoAdubo);
    }

    public void precoCorteGrama(){
        valorCorteGrama = qtdMetrosGrama * valorMetroGrama;
        System.out.printf("O valor total para cortar toda a grama do seu jardim é: R$%,.2f%n", valorCorteGrama);
    }
}

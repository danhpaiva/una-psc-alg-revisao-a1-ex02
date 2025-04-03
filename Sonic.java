import java.util.Scanner;

public class Sonic {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int novosAliados;
    int esperanca = 0;
    int medo = 0;

    System.out.print("\nQuantos novos aliados Sonic, Knuckles e Tails encontraram? ");
    novosAliados = input.nextInt();

    if (novosAliados > 0) {
      esperanca = novosAliados * 15;
    } else {
      medo = 40;
    }

    int desafio1, desafio2, desafio3;
    double mediaDesafios;
    int confianca = 0;
    int desanimo = 0;

    System.out.print("Pontuação no Desafio 1 (0-10): ");
    desafio1 = input.nextInt();
    System.out.print("Pontuação no Desafio 2 (0-10): ");
    desafio2 = input.nextInt();
    System.out.print("Pontuação no Desafio 3 (0-10): ");
    desafio3 = input.nextInt();

    mediaDesafios = (double) (desafio1 + desafio2 + desafio3) / 3;

    if (mediaDesafios >= 7) {
      confianca = 60;
    } else {
      desanimo = 60;
    }

    int estrategiasAnalisadas;
    int determinacao = 0;
    int incerteza = 0;
    int totalEstrategias = 12;

    System.out.print("Quantas estratégias de " + totalEstrategias + " a equipe conseguiu analisar? ");
    estrategiasAnalisadas = input.nextInt();

    determinacao = estrategiasAnalisadas * 10;
    incerteza = (totalEstrategias - estrategiasAnalisadas) * 10;

    int totalPositivo = esperanca + confianca + determinacao;
    int totalNegativo = medo + desanimo + incerteza;

    System.out.println("\n--- Análise da Situação ---");
    System.out.println("Esperança: " + esperanca + " | Medo: " + medo);
    System.out.println("Confiança: " + confianca + " | Desânimo: " + desanimo);
    System.out.println("Determinação: " + determinacao + " | Incerteza: " + incerteza);
    System.out.println("--- Total ---");
    System.out.println("Total de Emoções Positivas: " + totalPositivo);
    System.out.println("Total de Emoções Negativas: " + totalNegativo);
    System.out.println("--- Resultado da Batalha ---");

    if (totalPositivo > totalNegativo) {
      System.out.println("\nShadow foi derrotado! A união e a determinação da equipe prevaleceram!");
    } else {
      System.out.println("\nShadow venceu o time do Sonic... A improvável aliança pode ser a única esperança!");
    }

    input.close();
  }
}
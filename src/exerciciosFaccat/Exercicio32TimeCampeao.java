package exerciciosFaccat;

//Ler o nome de 2 times e o n�mero de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso n�o haja vencedor dever� ser impressa a palavra EMPATE.

import java.util.Scanner;

public class Exercicio32TimeCampeao {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Qual o nome do time que competiu? ");
     String time1 = scanner.nextLine();

     System.out.print("Qual o nome do outro time que competiu? ");
     String time2 = scanner.nextLine();

     System.out.print("Quantos gols " + time1 + " marcou? ");
     int golsTime1 = scanner.nextInt();

     System.out.print("Quantos gols " + time2 + " marcou? ");
     int golsTime2 = scanner.nextInt();

     if (golsTime1 > golsTime2) {
         System.out.println(time1 + " foi o campe�o com " + golsTime1 + " gols!");
     } else if (golsTime2 > golsTime1) {
         System.out.println(time2 + " foi o campe�o com " + golsTime2 + " gols!");
     } else {
         System.out.println(time1 + " marcou " + golsTime1 + " gols e " + time2 + 
                            " marcou " + golsTime2 + " gols. O que quer dizer que houve um EMPATE.");
     }

     scanner.close();
 }
}
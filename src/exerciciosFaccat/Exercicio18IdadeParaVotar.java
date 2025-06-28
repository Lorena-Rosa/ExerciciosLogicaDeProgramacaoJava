package exerciciosFaccat;

// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu).

import java.util.Scanner;

public class Exercicio18IdadeParaVotar {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Em qual ano estamos? ");
     int anoAtual = scanner.nextInt();

     System.out.print("Qual o ano do seu nascimento? ");
     int anoNascimento = scanner.nextInt();

     int idade = anoAtual - anoNascimento;

     if (idade < 16) {
         System.out.println("Voc� n�o poder� votar esse ano, pois possui " + idade + " anos.");
     } else {
         System.out.println("Voc� poder� votar esse ano, pois possui " + idade + " anos.");
     }

     scanner.close();
 }
}
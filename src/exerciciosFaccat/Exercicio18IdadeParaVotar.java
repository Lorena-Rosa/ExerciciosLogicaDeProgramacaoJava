package exerciciosFaccat;

// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

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
         System.out.println("Você não poderá votar esse ano, pois possui " + idade + " anos.");
     } else {
         System.out.println("Você poderá votar esse ano, pois possui " + idade + " anos.");
     }

     scanner.close();
 }
}
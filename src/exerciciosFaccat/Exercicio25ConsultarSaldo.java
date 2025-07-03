package exerciciosFaccat;

//Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, calcular e
//escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo Negativo'.

import java.util.Scanner;

public class Exercicio25ConsultarSaldo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Qual o n�mero de sua conta? ");
     int numeroConta = scanner.nextInt();

     System.out.print("Digite o saldo de sua conta: ");
     double saldo = scanner.nextDouble();

     System.out.print("Digite o d�bito: ");
     double debito = scanner.nextDouble();

     System.out.print("Digite o cr�dito: ");
     double credito = scanner.nextDouble();

     double saldoAtual = saldo - debito + credito;

     System.out.printf("Seu saldo atual � de: R$%.2f\n", saldoAtual);

     if (saldoAtual >= 0) {
         System.out.println("Seu saldo � Positivo");
     } else {
         System.out.println("Seu saldo � Negativo");
     }

     scanner.close();
 }
}
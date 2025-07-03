package exerciciosFaccat;

//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

import java.util.Scanner;

public class Exercicio25ConsultarSaldo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Qual o número de sua conta? ");
     int numeroConta = scanner.nextInt();

     System.out.print("Digite o saldo de sua conta: ");
     double saldo = scanner.nextDouble();

     System.out.print("Digite o débito: ");
     double debito = scanner.nextDouble();

     System.out.print("Digite o crédito: ");
     double credito = scanner.nextDouble();

     double saldoAtual = saldo - debito + credito;

     System.out.printf("Seu saldo atual é de: R$%.2f\n", saldoAtual);

     if (saldoAtual >= 0) {
         System.out.println("Seu saldo é Positivo");
     } else {
         System.out.println("Seu saldo é Negativo");
     }

     scanner.close();
 }
}
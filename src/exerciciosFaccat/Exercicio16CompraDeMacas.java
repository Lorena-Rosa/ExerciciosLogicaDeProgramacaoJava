package exerciciosFaccat;

//As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e
//escreva o custo total da compra.

import java.util.Scanner;

public class Exercicio16CompraDeMacas {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o n�mero de ma��s compradas: ");
     int macasCompradas = scanner.nextInt();

     double valorTotal;
     if (macasCompradas < 12) {
         valorTotal = macasCompradas * 1.30;
     } else {
         valorTotal = macasCompradas * 1.00;
     }

     System.out.printf("O valor total da sua compra � de: R$%.2f\n", valorTotal);

     scanner.close();
 }
}
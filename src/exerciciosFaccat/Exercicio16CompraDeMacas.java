package exerciciosFaccat;

//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra.

import java.util.Scanner;

public class Exercicio16CompraDeMacas {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o número de maçãs compradas: ");
     int macasCompradas = scanner.nextInt();

     double valorTotal;
     if (macasCompradas < 12) {
         valorTotal = macasCompradas * 1.30;
     } else {
         valorTotal = macasCompradas * 1.00;
     }

     System.out.printf("O valor total da sua compra é de: R$%.2f\n", valorTotal);

     scanner.close();
 }
}
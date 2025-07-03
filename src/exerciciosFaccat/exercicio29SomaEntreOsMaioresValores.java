package exerciciosFaccat;

//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores.

import java.util.Scanner;

public class exercicio29SomaEntreOsMaioresValores {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o primeiro valor: ");
     double valor1 = scanner.nextDouble();

     System.out.print("Digite o segundo valor: ");
     double valor2 = scanner.nextDouble();

     System.out.print("Digite o terceiro valor: ");
     double valor3 = scanner.nextDouble();

     double soma;

     if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
         soma = 0;
         System.out.println("Não pode haver números iguais entre os 3 números digitados.");
     } else {
         if (valor1 > valor2 && valor1 > valor3) {
             soma = (valor2 > valor3) ? valor1 + valor2 : valor1 + valor3;
         } else if (valor2 > valor1 && valor2 > valor3) {
             soma = (valor1 > valor3) ? valor2 + valor1 : valor2 + valor3;
         } else {
             soma = (valor1 > valor2) ? valor3 + valor1 : valor3 + valor2;
         }

         System.out.printf("A soma dos dois maiores valores é igual a: %.2f\n", soma);
     }

     scanner.close();
 }
}
package exerciciosFaccat;

//Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever a soma dos 2
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
         System.out.println("N�o pode haver n�meros iguais entre os 3 n�meros digitados.");
     } else {
         if (valor1 > valor2 && valor1 > valor3) {
             soma = (valor2 > valor3) ? valor1 + valor2 : valor1 + valor3;
         } else if (valor2 > valor1 && valor2 > valor3) {
             soma = (valor1 > valor3) ? valor2 + valor1 : valor2 + valor3;
         } else {
             soma = (valor1 > valor2) ? valor3 + valor1 : valor3 + valor2;
         }

         System.out.printf("A soma dos dois maiores valores � igual a: %.2f\n", soma);
     }

     scanner.close();
 }
}
package exerciciosFaccat;

// Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o maior deles

import java.util.Scanner;

public class Exercicio19MaiorNumero  {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor: ");
     double valor1 = scanner.nextDouble();

     System.out.print("Digite outro valor: ");
     double valor2 = scanner.nextDouble();

     if (valor1 == valor2) {
         System.out.println("Os n�meros digitados n�o podem ser iguais.");
     } else {
         if (valor1 > valor2) {
             System.out.println("O maior valor digitado foi: " + valor1);
         } else {
             System.out.println("O maior valor digitado foi: " + valor2);
         }
     }

     scanner.close();
 }
}
package exerciciosFaccat;

//Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever o maior deles

import java.util.Scanner;

public class Exercicio28MaiorValorDigitado {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o primeiro valor: ");
     double valor1 = scanner.nextDouble();

     System.out.print("Digite o segundo valor: ");
     double valor2 = scanner.nextDouble();

     System.out.print("Digite o terceiro valor: ");
     double valor3 = scanner.nextDouble();

     if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
         System.out.println("Entre os 3 n�meros digitados n�o podem haver n�meros iguais.");
     } else {
         if (valor1 > valor2 && valor1 > valor3) {
             System.out.println("O maior valor �: " + valor1);
         } else if (valor2 > valor3) {
             System.out.println("O maior valor �: " + valor2);
         } else {
             System.out.println("O maior valor �: " + valor3);
         }
     }

     scanner.close();
 }
}
package exerciciosFaccat;

//Ler um valor e escrever se é positivo, negativo ou zero.

import java.util.Scanner;

public class Exercicio27PositivoNegativoOuZero {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um número: ");
     int numero = scanner.nextInt();

     if (numero < 0) {
         System.out.println("O número " + numero + " é negativo!");
     } else {
         if (numero > 0) {
             System.out.println("O número " + numero + " é positivo!");
         } else {
             System.out.println("O número digitado foi 0.");
         }
     }

     scanner.close();
 }
}
package exerciciosFaccat;

//Ler um valor e escrever se � positivo, negativo ou zero.

import java.util.Scanner;

public class Exercicio27PositivoNegativoOuZero {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um n�mero: ");
     int numero = scanner.nextInt();

     if (numero < 0) {
         System.out.println("O n�mero " + numero + " � negativo!");
     } else {
         if (numero > 0) {
             System.out.println("O n�mero " + numero + " � positivo!");
         } else {
             System.out.println("O n�mero digitado foi 0.");
         }
     }

     scanner.close();
 }
}
package exerciciosFaccat;

//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).


import java.util.Scanner;

public class Exercicio15PositivoOuNegativo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor: ");
     int valor = scanner.nextInt();

     if (valor < 0) {
         System.out.println("O valor " + valor + " é negativo!");
     } else {
         System.out.println("O valor " + valor + " é positivo!");
     }

     scanner.close();
 }
}
package ExerciciosManzano;

//Calcula o quadrado da soma de A, B e C

import java.util.Scanner;

public class Exercicio7mQuadradoDaSoma {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor para A: ");
     double a = scanner.nextDouble();

     System.out.print("Digite um valor para B: ");
     double b = scanner.nextDouble();

     System.out.print("Digite um valor para C: ");
     double c = scanner.nextDouble();

     double soma = a + b + c;
     double quadradoSoma = soma * soma;

     System.out.printf("O quadrado da soma de A, B e C é: %.2f\n", quadradoSoma);

     scanner.close();
 }
}
package ExerciciosManzano;

//Calcula o quadrado de A, B, C e a soma desses quadrados

import java.util.Scanner;

public class Exercicio7lSomaDosQuadrados {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor para A: ");
     double a = scanner.nextDouble();

     System.out.print("Digite um valor para B: ");
     double b = scanner.nextDouble();

     System.out.print("Digite um valor para C: ");
     double c = scanner.nextDouble();

     double quadradoA = a * a;
     double quadradoB = b * b;
     double quadradoC = c * c;

     double somaQuadrados = quadradoA + quadradoB + quadradoC;

     System.out.printf("Quadrados: A = %.2f; B = %.2f; C = %.2f\n", quadradoA, quadradoB, quadradoC);
     System.out.printf("A soma dos quadrados de A, B e C é: %.2f\n", somaQuadrados);

     scanner.close();
 }
}
package ExerciciosManzano;

//Calcula o quadrado da diferença entre A e B

import java.util.Scanner;

public class Exercicio7iQuadradoDaDiferenca {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor inteiro para A: ");
     int a = scanner.nextInt();

     System.out.print("Digite um valor inteiro para B: ");
     int b = scanner.nextInt();

     int resultado = a - b;
     resultado = resultado * resultado;

     System.out.println("O quadrado da diferença de A por B é: " + resultado);

     scanner.close();
 }
}
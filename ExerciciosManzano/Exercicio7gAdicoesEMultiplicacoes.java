package ExerciciosManzano;

//Realiza todas as adi��es e multiplica��es entre pares das vari�veis A, B, C e D

import java.util.Scanner;

public class Exercicio7gAdicoesEMultiplicacoes {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor para A: ");
     double a = scanner.nextDouble();

     System.out.print("Digite um valor para B: ");
     double b = scanner.nextDouble();

     System.out.print("Digite um valor para C: ");
     double c = scanner.nextDouble();

     System.out.print("Digite um valor para D: ");
     double d = scanner.nextDouble();

     System.out.println("\nA = " + a + "; B = " + b + "; C = " + c + "; D = " + d);
     System.out.println("\nA seguir estar�o as adi��es:");
     System.out.println(a + " + " + b + " = " + (a + b));
     System.out.println(a + " + " + c + " = " + (a + c));
     System.out.println(a + " + " + d + " = " + (a + d));
     System.out.println(b + " + " + c + " = " + (b + c));
     System.out.println(b + " + " + d + " = " + (b + d));
     System.out.println(c + " + " + d + " = " + (c + d));

     System.out.println("\nA seguir estar�o as multiplica��es:");
     System.out.println(a + " * " + b + " = " + (a * b));
     System.out.println(a + " * " + c + " = " + (a * c));
     System.out.println(a + " * " + d + " = " + (a * d));
     System.out.println(b + " * " + c + " = " + (b * c));
     System.out.println(b + " * " + d + " = " + (b * d));
     System.out.println(c + " * " + d + " = " + (c * d));

     scanner.close();
 }
}
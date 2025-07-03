package ExerciciosManzano;

//Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de 
//forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
//variável A. Apresentar os valores trocados

import java.util.Scanner;

public class Exercicio7fInverterValores {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor para A: ");
     double a = scanner.nextDouble();

     System.out.print("Digite um valor para B: ");
     double b = scanner.nextDouble();

     System.out.printf("Antes A = %.2f e B = %.2f\n", a, b);

     double guardaA = a;
     a = b;
     b = guardaA;

     System.out.printf("Agora A = %.2f e B = %.2f\n", a, b);

     scanner.close();
 }
}
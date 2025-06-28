package exerciciosFaccat;

//Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
//final é:
//n1 * 2 + n2 * 3 + n3 * 5
//-----------------------------------
//10

import java.util.Scanner;

public class Exercicio13MediaPonderada  {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor da 1ª nota do aluno: ");
     double nota1 = scanner.nextDouble();

     System.out.print("Digite o valor da 2ª nota do aluno: ");
     double nota2 = scanner.nextDouble();

     System.out.print("Digite o valor da 3ª nota do aluno: ");
     double nota3 = scanner.nextDouble();

     double mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

     System.out.printf("A média final do aluno é: %.2f\n", mediaFinal);

     scanner.close();
 }
}
package exerciciosFaccat;

//Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno.
//Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia
//final �:
//n1 * 2 + n2 * 3 + n3 * 5
//-----------------------------------
//10

import java.util.Scanner;

public class Exercicio13MediaPonderada  {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor da 1� nota do aluno: ");
     double nota1 = scanner.nextDouble();

     System.out.print("Digite o valor da 2� nota do aluno: ");
     double nota2 = scanner.nextDouble();

     System.out.print("Digite o valor da 3� nota do aluno: ");
     double nota3 = scanner.nextDouble();

     double mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

     System.out.printf("A m�dia final do aluno �: %.2f\n", mediaFinal);

     scanner.close();
 }
}
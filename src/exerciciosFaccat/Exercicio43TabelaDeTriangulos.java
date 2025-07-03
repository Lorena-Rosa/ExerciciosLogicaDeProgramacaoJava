package exerciciosFaccat;

//Seja o seguinte algoritmo:
//inicio
//ler a, b, c
//se (a < b+c) e (b <a+c) e (c <a+b) ent�o
//se (a=b) e (b=c) ent�o
//mens <- 'Tri�ngulo Equil�tero'
//sen�o
//se (a=b) ou (b=c) ou (a=c) ent�o
//mens <- 'Tri�ngulo Is�sceles'
//sen�o
//mens <- 'Tri�ngulo Escaleno'
//fim_se
//fim_se
//sen�o
//mens <- 'N�o e poss�vel formar um tri�ngulo'
//fim_se
//escrever mens
//fim
//Fa�a um teste de mesa e complete o quadro a seguir para os seguintes valores das vari�veis:
//Vari�veis
//a b C 
//1 2 3
//3 4 5
//2 2 4
//4 4 4
//5 3 3

import java.util.Scanner;

public class Exercicio43TabelaDeTriangulos {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor de A: ");
     double A = scanner.nextDouble();

     System.out.print("Digite o valor de B: ");
     double B = scanner.nextDouble();

     System.out.print("Digite o valor de C: ");
     double C = scanner.nextDouble();

     if (A < B + C && B < A + C && C < A + B) {
         if (A == B && B == C) {
             System.out.println("Tri�ngulo Equil�tero");
         } else if (A == B || B == C || A == C) {
             System.out.println("Tri�ngulo Is�sceles");
         } else {
             System.out.println("Tri�ngulo Escaleno");
         }
     } else {
         System.out.println("N�o � poss�vel formar um tri�ngulo");
     }

     scanner.close();
 }
}
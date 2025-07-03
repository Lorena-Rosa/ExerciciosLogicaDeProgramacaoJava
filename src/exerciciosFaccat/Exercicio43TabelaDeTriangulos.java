package exerciciosFaccat;

//Seja o seguinte algoritmo:
//inicio
//ler a, b, c
//se (a < b+c) e (b <a+c) e (c <a+b) então
//se (a=b) e (b=c) então
//mens <- 'Triângulo Equilátero'
//senão
//se (a=b) ou (b=c) ou (a=c) então
//mens <- 'Triângulo Isósceles'
//senão
//mens <- 'Triângulo Escaleno'
//fim_se
//fim_se
//senão
//mens <- 'Não e possível formar um triângulo'
//fim_se
//escrever mens
//fim
//Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das variáveis:
//Variáveis
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
             System.out.println("Triângulo Equilátero");
         } else if (A == B || B == C || A == C) {
             System.out.println("Triângulo Isósceles");
         } else {
             System.out.println("Triângulo Escaleno");
         }
     } else {
         System.out.println("Não é possível formar um triângulo");
     }

     scanner.close();
 }
}
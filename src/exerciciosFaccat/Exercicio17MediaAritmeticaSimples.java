package exerciciosFaccat;

//Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada

import java.util.Scanner;

public class Exercicio17MediaAritmeticaSimples {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Qual foi a nota do aluno na primeira avaliação? (0 a 10): ");
     double nota1 = scanner.nextDouble();

     System.out.print("Qual foi a nota do aluno na segunda avaliação? (0 a 10): ");
     double nota2 = scanner.nextDouble();

     double media = (nota1 + nota2) / 2;

     if (media < 6) {
         System.out.printf("O aluno foi REPROVADO com a média: %.2f\n", media);
     } else {
         System.out.printf("O aluno foi APROVADO com a média: %.2f\n", media);
     }

     scanner.close();
 }
}
package exerciciosFaccat;

//Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever
//uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o
//aluno � aprovado). Escrever tamb�m a m�dia calculada

import java.util.Scanner;

public class Exercicio17MediaAritmeticaSimples {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Qual foi a nota do aluno na primeira avalia��o? (0 a 10): ");
     double nota1 = scanner.nextDouble();

     System.out.print("Qual foi a nota do aluno na segunda avalia��o? (0 a 10): ");
     double nota2 = scanner.nextDouble();

     double media = (nota1 + nota2) / 2;

     if (media < 6) {
         System.out.printf("O aluno foi REPROVADO com a m�dia: %.2f\n", media);
     } else {
         System.out.printf("O aluno foi APROVADO com a m�dia: %.2f\n", media);
     }

     scanner.close();
 }
}
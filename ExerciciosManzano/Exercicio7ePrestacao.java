package ExerciciosManzano;

//Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula 
//PRESTACAO <- VALOR + (VALOR * TAXA/100) * TEMPO).

import java.util.Scanner;

public class Exercicio7ePrestacao {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor inicial da prestação: ");
     double valorInicial = scanner.nextDouble();

     System.out.print("Digite a taxa de juros (em porcentagem): ");
     double taxa = scanner.nextDouble();

     System.out.print("Digite o tempo de atraso da prestação (em meses): ");
     double tempoAtraso = scanner.nextDouble();

     double prestacao = valorInicial + ((valorInicial * taxa / 100) * tempoAtraso);

     System.out.printf("Agora o valor da prestação é: R$%.2f\n", prestacao);

     scanner.close();
 }
}
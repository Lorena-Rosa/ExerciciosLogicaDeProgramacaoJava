package ExerciciosManzano;

//Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula 
//PRESTACAO <- VALOR + (VALOR * TAXA/100) * TEMPO).

import java.util.Scanner;

public class Exercicio7ePrestacao {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor inicial da presta��o: ");
     double valorInicial = scanner.nextDouble();

     System.out.print("Digite a taxa de juros (em porcentagem): ");
     double taxa = scanner.nextDouble();

     System.out.print("Digite o tempo de atraso da presta��o (em meses): ");
     double tempoAtraso = scanner.nextDouble();

     double prestacao = valorInicial + ((valorInicial * taxa / 100) * tempoAtraso);

     System.out.printf("Agora o valor da presta��o �: R$%.2f\n", prestacao);

     scanner.close();
 }
}
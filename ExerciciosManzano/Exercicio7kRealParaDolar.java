package ExerciciosManzano;

//Converte valor em reais para d�lares usando a cota��o informada

import java.util.Scanner;

public class Exercicio7kRealParaDolar {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite qual a cota��o do d�lar: ");
     double cotacaoDolar = scanner.nextDouble();

     System.out.print("Digite o valor em reais que voc� possui: ");
     double quantidadeReal = scanner.nextDouble();

     double valorEmDolar = quantidadeReal / cotacaoDolar;

     System.out.printf("O valor convertido em d�lares �: US$%.2f\n", valorEmDolar);

     scanner.close();
 }
}
package ExerciciosManzano;

//Converte valor em d�lar para reais usando a cota��o informada

import java.util.Scanner;

public class Exercicio7jDolarParaReal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor da cota��o do d�lar: ");
     double cotacaoDolar = scanner.nextDouble();

     System.out.print("Digite quantos d�lares voc� tem: ");
     double quantidadeDolar = scanner.nextDouble();

     double valorEmReais = cotacaoDolar * quantidadeDolar;

     System.out.printf("O valor convertido em reais �: R$%.2f\n", valorEmReais);

     scanner.close();
 }
}
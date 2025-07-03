package ExerciciosManzano;

//Converte valor em reais para dólares usando a cotação informada

import java.util.Scanner;

public class Exercicio7kRealParaDolar {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite qual a cotação do dólar: ");
     double cotacaoDolar = scanner.nextDouble();

     System.out.print("Digite o valor em reais que você possui: ");
     double quantidadeReal = scanner.nextDouble();

     double valorEmDolar = quantidadeReal / cotacaoDolar;

     System.out.printf("O valor convertido em dólares é: US$%.2f\n", valorEmDolar);

     scanner.close();
 }
}
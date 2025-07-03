package ExerciciosManzano;

//Converte valor em dólar para reais usando a cotação informada

import java.util.Scanner;

public class Exercicio7jDolarParaReal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor da cotação do dólar: ");
     double cotacaoDolar = scanner.nextDouble();

     System.out.print("Digite quantos dólares você tem: ");
     double quantidadeDolar = scanner.nextDouble();

     double valorEmReais = cotacaoDolar * quantidadeDolar;

     System.out.printf("O valor convertido em reais é: R$%.2f\n", valorEmReais);

     scanner.close();
 }
}
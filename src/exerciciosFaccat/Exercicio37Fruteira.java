package exerciciosFaccat;

//Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//Até 5 Kg Acima de 5 Kg
//Morango R$ 2,50 por Kg R$ 2,20 por Kg
//Maçã R$ 1,80 por Kg R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
//ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
//morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

import java.util.Scanner;

public class Exercicio37Fruteira {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite quantos kg de morango foram comprados: ");
     double kgMorango = scanner.nextDouble();

     System.out.print("Digite quantos kg de maçã foram comprados: ");
     double kgMaca = scanner.nextDouble();

     double precoMorango = (kgMorango <= 5) ? 2.50 : 2.20;
     double precoMaca = (kgMaca <= 5) ? 1.80 : 1.50;

     double kgFrutas = kgMorango + kgMaca;
     double valorTotal = (kgMorango * precoMorango) + (kgMaca * precoMaca);

     if (kgFrutas > 8 || valorTotal > 25) {
         valorTotal -= valorTotal * 0.10;
     }

     System.out.printf("O valor total a ser pago é: R$%.2f\n", valorTotal);

     scanner.close();
 }
}
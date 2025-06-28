package exerciciosFaccat;

//Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
//mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
//vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do
//vendedor

import java.util.Scanner;

public class Exercicio11SalarioVendasCarro {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o n�mero de carros vendidos: ");
     int carrosVendidos = scanner.nextInt();

     System.out.print("Digite o valor total das vendas: R$");
     double valorVendas = scanner.nextDouble();

     System.out.print("Digite o sal�rio fixo do funcion�rio: ");
     double salarioFixo = scanner.nextDouble();

     System.out.print("Digite o valor da comiss�o por cada carro vendido: ");
     double comissaoCarro = scanner.nextDouble();

     double salarioFinal = salarioFixo + (carrosVendidos * comissaoCarro) + (valorVendas * 0.05);
     System.out.printf("O sal�rio final do vendedor �: R$%.2f\n", salarioFinal);

     scanner.close();
 }
}

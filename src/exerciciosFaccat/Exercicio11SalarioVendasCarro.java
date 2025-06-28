package exerciciosFaccat;

//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor

import java.util.Scanner;

public class Exercicio11SalarioVendasCarro {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o número de carros vendidos: ");
     int carrosVendidos = scanner.nextInt();

     System.out.print("Digite o valor total das vendas: R$");
     double valorVendas = scanner.nextDouble();

     System.out.print("Digite o salário fixo do funcionário: ");
     double salarioFixo = scanner.nextDouble();

     System.out.print("Digite o valor da comissão por cada carro vendido: ");
     double comissaoCarro = scanner.nextDouble();

     double salarioFinal = salarioFixo + (carrosVendidos * comissaoCarro) + (valorVendas * 0.05);
     System.out.printf("O salário final do vendedor é: R$%.2f\n", salarioFinal);

     scanner.close();
 }
}

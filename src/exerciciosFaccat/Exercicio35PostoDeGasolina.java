package exerciciosFaccat;

//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//até 20 litros, desconto de 3% por litro
//Álcool acima de 20 litros, desconto de 5% por litro
//até 20 litros, desconto de 4% por litro
//Gasolina acima de 20 litros, desconto de 6% por litro
//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
//seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
//que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.

import java.util.Scanner;

public class Exercicio35PostoDeGasolina {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o tipo de combustível usado para abastecer (A = álcool; G = gasolina): ");
     String combustivel = scanner.nextLine().toUpperCase();

     System.out.print("Digite quantos litros foram usados para abastecer: ");
     double litros = scanner.nextDouble();

     double precoLitro = 0, desconto = 0;

     if (combustivel.equals("A")) {
         precoLitro = 2.90;
         desconto = litros <= 20 ? 0.03 : 0.05;
     } else if (combustivel.equals("G")) {
         precoLitro = 3.30;
         desconto = litros <= 20 ? 0.04 : 0.06;
     } else {
         System.out.println("Tipo de combustível inválido.");
     }

     if (combustivel.equals("A") || combustivel.equals("G")) {
         double valorBruto = precoLitro * litros;
         double valorDesconto = valorBruto * desconto;
         double valorFinal = valorBruto - valorDesconto;

         System.out.printf("O valor a pagar é: R$%.2f\n", valorFinal);
     }

     scanner.close();
 }
}
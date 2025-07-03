package exerciciosFaccat;

//Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
//at� 20 litros, desconto de 3% por litro
//�lcool acima de 20 litros, desconto de 5% por litro
//at� 20 litros, desconto de 4% por litro
//Gasolina acima de 20 litros, desconto de 6% por litro
//Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da
//seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
//que o pre�o do litro da gasolina � R$ 3,30 e o pre�o do litro do �lcool � R$ 2,90.

import java.util.Scanner;

public class Exercicio35PostoDeGasolina {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o tipo de combust�vel usado para abastecer (A = �lcool; G = gasolina): ");
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
         System.out.println("Tipo de combust�vel inv�lido.");
     }

     if (combustivel.equals("A") || combustivel.equals("G")) {
         double valorBruto = precoLitro * litros;
         double valorDesconto = valorBruto * desconto;
         double valorFinal = valorBruto - valorDesconto;

         System.out.printf("O valor a pagar �: R$%.2f\n", valorFinal);
     }

     scanner.close();
 }
}
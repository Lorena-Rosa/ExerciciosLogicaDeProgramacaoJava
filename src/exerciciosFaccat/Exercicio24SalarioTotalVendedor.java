package exerciciosFaccat;

//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
//ultrapassar este valor, calcular e escrever o seu salário total.

import java.util.Scanner;

public class Exercicio24SalarioTotalVendedor {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Qual o salário fixo do vendedor? ");
     double salarioFixo = scanner.nextDouble();

     System.out.print("Qual o valor das vendas efetuadas pelo vendedor? ");
     double vendas = scanner.nextDouble();

     double comissao;
     if (vendas <= 1500) {
         comissao = vendas * 0.03;
     } else {
         comissao = (1500 * 0.03) + ((vendas - 1500) * 0.05);
     }

     double salarioTotal = salarioFixo + comissao;

     System.out.printf("O salário total do vendedor é: R$%.2f\n", salarioTotal);

     scanner.close();
 }
}
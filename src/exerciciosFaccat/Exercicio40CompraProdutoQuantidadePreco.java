package exerciciosFaccat;

//Fa�a um algoritmo para ler: a descri��o do produto (nome), a quantidade adquirida e o pre�o
//unit�rio. Calcular e escrever o total (total = quantidade adquirida * pre�o unit�rio), o desconto e o total
//a pagar (total a pagar = total - desconto), sabendo-se que:
//- Se quantidade <= 5 o desconto ser� de 2%
//- Se quantidade > 5 e quantidade <=10 o desconto ser� de 3%
//- Se quantidade > 10 o desconto ser� de 5%

import java.util.Scanner;

public class Exercicio40CompraProdutoQuantidadePreco {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o nome do produto comprado: ");
     String nomeProduto = scanner.nextLine();

     System.out.print("Digite a quantidade de produto adquirida: ");
     int quantidade = scanner.nextInt();

     System.out.print("Digite o pre�o do produto: R$");
     double preco = scanner.nextDouble();

     double total = quantidade * preco;
     double desconto;

     if (quantidade <= 5) {
         desconto = total * 0.02;
     } else if (quantidade <= 10) {
         desconto = total * 0.03;
     } else {
         desconto = total * 0.05;
     }

     double valorTotal = total - desconto;

     System.out.printf("A quantidade de %s comprada foi: %d e o total da compra deu: R$%.2f\n",
                       nomeProduto, quantidade, valorTotal);

     scanner.close();
 }
}
package exerciciosFaccat;

//Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
//unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
//a pagar (total a pagar = total - desconto), sabendo-se que:
//- Se quantidade <= 5 o desconto será de 2%
//- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//- Se quantidade > 10 o desconto será de 5%

import java.util.Scanner;

public class Exercicio40CompraProdutoQuantidadePreco {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o nome do produto comprado: ");
     String nomeProduto = scanner.nextLine();

     System.out.print("Digite a quantidade de produto adquirida: ");
     int quantidade = scanner.nextInt();

     System.out.print("Digite o preço do produto: R$");
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
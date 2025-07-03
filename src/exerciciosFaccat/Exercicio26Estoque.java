package exerciciosFaccat;

//Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e
//quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade
//m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar
//compra'

import java.util.Scanner;

public class Exercicio26Estoque {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite a quantidade atual em estoque: ");
     double quantidadeAtual = scanner.nextDouble();

     System.out.print("Digite a quantidade m�xima em estoque: ");
     double quantidadeMaxima = scanner.nextDouble();

     System.out.print("Digite a quantidade m�nima em estoque: ");
     double quantidadeMinima = scanner.nextDouble();

     double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

     System.out.printf("A quantidade m�dia do estoque �: %.2f\n", quantidadeMedia);

     if (quantidadeAtual >= quantidadeMedia) {
         System.out.println("N�o efetuar compra");
     } else {
         System.out.println("Efetuar compra");
     }

     scanner.close();
 }
}
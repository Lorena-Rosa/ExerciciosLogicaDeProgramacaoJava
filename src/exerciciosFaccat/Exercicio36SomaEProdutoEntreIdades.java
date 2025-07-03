package exerciciosFaccat;

//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
//das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
//novo com a mulher mais velha.

	import java.util.Scanner;

public class Exercicio36SomaEProdutoEntreIdades {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite a idade do primeiro homem: ");
     int idadeHomem1 = scanner.nextInt();

     System.out.print("Digite a idade do segundo homem: ");
     int idadeHomem2 = scanner.nextInt();

     System.out.print("Digite a idade da primeira mulher: ");
     int idadeMulher1 = scanner.nextInt();

     System.out.print("Digite a idade da segunda mulher: ");
     int idadeMulher2 = scanner.nextInt();

     if (idadeHomem1 == idadeHomem2 || idadeMulher1 == idadeMulher2) {
         System.out.println("As idades dos dois homens ou das duas mulheres não podem ser iguais.");
     } else {
         int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
         int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
         int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
         int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

         int soma = homemMaisVelho + mulherMaisNova;
         int produto = homemMaisNovo * mulherMaisVelha;

         System.out.println("A SOMA entre a idade do homem mais velho (" + homemMaisVelho +
                            " anos) e a mulher mais nova (" + mulherMaisNova + " anos) é: " + soma);
         System.out.println("O PRODUTO entre o homem mais novo (" + homemMaisNovo +
                            " anos) e a mulher mais velha (" + mulherMaisVelha + " anos) é: " + produto);
     }

     scanner.close();
 }
}
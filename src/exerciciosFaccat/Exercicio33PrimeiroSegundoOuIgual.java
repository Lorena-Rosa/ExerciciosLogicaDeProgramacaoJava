package exerciciosFaccat;

//Ler dois valores e imprimir uma das três mensagens a seguir:
//‘Números iguais’, caso os números sejam iguais
//‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
//‘Segundo maior’, caso o segundo seja maior que o primeiro.

	import java.util.Scanner;

public class Exercicio33PrimeiroSegundoOuIgual {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor: ");
     double valor1 = scanner.nextDouble();

     System.out.print("Digite outro valor: ");
     double valor2 = scanner.nextDouble();

     if (valor1 > valor2) {
         System.out.println("Primeiro é maior");
     } else if (valor2 > valor1) {
         System.out.println("Segundo é maior");
     } else {
         System.out.println("Números iguais");
     }

     scanner.close();
 }
}
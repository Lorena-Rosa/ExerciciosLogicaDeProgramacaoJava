package exerciciosFaccat;

//Ler dois valores e imprimir uma das tr�s mensagens a seguir:
//�N�meros iguais�, caso os n�meros sejam iguais
//�Primeiro � maior�, caso o primeiro seja maior que o segundo;
//�Segundo maior�, caso o segundo seja maior que o primeiro.

	import java.util.Scanner;

public class Exercicio33PrimeiroSegundoOuIgual {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor: ");
     double valor1 = scanner.nextDouble();

     System.out.print("Digite outro valor: ");
     double valor2 = scanner.nextDouble();

     if (valor1 > valor2) {
         System.out.println("Primeiro � maior");
     } else if (valor2 > valor1) {
         System.out.println("Segundo � maior");
     } else {
         System.out.println("N�meros iguais");
     }

     scanner.close();
 }
}
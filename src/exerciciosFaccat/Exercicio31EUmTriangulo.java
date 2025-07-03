package exerciciosFaccat;

//Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e escrever se formam
//ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor que a soma
//dos outros 2 lados.

	import java.util.Scanner;

public class Exercicio31EUmTriangulo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o primeiro valor: ");
     double valor1 = scanner.nextDouble();

     System.out.print("Digite o segundo valor: ");
     double valor2 = scanner.nextDouble();

     System.out.print("Digite o terceiro valor: ");
     double valor3 = scanner.nextDouble();

     if (
         valor1 < valor2 + valor3 &&
         valor2 < valor1 + valor3 &&
         valor3 < valor1 + valor2
     ) {
         System.out.println("Essa figura � um tri�ngulo.");
     } else {
         System.out.println("Essa figura n�o � um tri�ngulo.");
     }

     scanner.close();
 }
}
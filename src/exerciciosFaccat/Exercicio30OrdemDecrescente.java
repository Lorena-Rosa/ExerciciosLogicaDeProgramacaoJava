package exerciciosFaccat;

//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
//crescente.

import java.util.Scanner;

public class Exercicio30OrdemDecrescente  {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor: ");
     int contador = scanner.nextInt();

     while (contador > 0) {
         System.out.println("Contador: " + contador);
         contador--;
     }

     scanner.close();
 }
}
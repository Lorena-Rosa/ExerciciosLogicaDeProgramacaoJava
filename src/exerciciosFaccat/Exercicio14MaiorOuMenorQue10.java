package exerciciosFaccat;



import java.util.Scanner;

public class Exercicio14MaiorOuMenorQue10 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Bem Vindo");
     System.out.print("Digite um valor inteiro: ");
     int valor = scanner.nextInt();

     if (valor > 10) {
         System.out.println("Esse valor é maior que 10!");
     } else {
         if (valor < 10) {
             System.out.println("Esse valor é menor que 10!");
         } else {
             System.out.println("Esse valor é igual a 10!");
         }
     }

     scanner.close();
 }
}
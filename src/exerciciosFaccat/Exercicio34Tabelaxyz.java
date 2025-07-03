package exerciciosFaccat;



import java.util.Scanner;

public class Exercicio34Tabelaxyz {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Escreva um valor para X: ");
     double X = scanner.nextDouble();

     System.out.print("Escreva um valor para Y: ");
     double Y = scanner.nextDouble();

     double Z = (X * Y) + 5;
     String resposta;

     if (Z <= 0) {
         resposta = "A";
     } else if (Z <= 100) {
         resposta = "B";
     } else {
         resposta = "C";
     }

     System.out.println("Resposta: " + resposta);

     scanner.close();
 }
}
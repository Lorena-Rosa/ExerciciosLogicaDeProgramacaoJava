package exerciciosFaccat;

// Calcula a área de um retângulo a partir da base e altura informadas


import java.util.Scanner;

public class Exercicio6AreaRetangulo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite qual o valor da altura do retângulo: ");
     double base = scanner.nextDouble();

     System.out.print("Digite qual o valor da base do retângulo: ");
     double altura = scanner.nextDouble();

     double area = base * altura;
     System.out.println("A área do retângulo é igual a: " + area);

     scanner.close();
 }
}

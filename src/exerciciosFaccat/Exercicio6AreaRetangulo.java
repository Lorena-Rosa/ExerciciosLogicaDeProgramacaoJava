package exerciciosFaccat;

// Calcula a �rea de um ret�ngulo a partir da base e altura informadas


import java.util.Scanner;

public class Exercicio6AreaRetangulo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite qual o valor da altura do ret�ngulo: ");
     double base = scanner.nextDouble();

     System.out.print("Digite qual o valor da base do ret�ngulo: ");
     double altura = scanner.nextDouble();

     double area = base * altura;
     System.out.println("A �rea do ret�ngulo � igual a: " + area);

     scanner.close();
 }
}

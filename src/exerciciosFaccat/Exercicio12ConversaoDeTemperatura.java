package exerciciosFaccat;


import java.util.Scanner;

public class Exercicio12ConversaoDeTemperatura  {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite a temperatura em Fahrenheit: ");
     double fahrenheit = scanner.nextDouble();

     double celsius = (5.0 / 9.0) * (fahrenheit - 32);

     System.out.printf("A temperatura em Celsius �: %.2f�C\n", celsius);

     scanner.close();
 }
}
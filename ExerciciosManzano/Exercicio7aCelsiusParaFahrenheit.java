package ExerciciosManzano;

//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de 
//conversão é F <-> (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.


import java.util.Scanner;

public class Exercicio7aCelsiusParaFahrenheit {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite a temperatura em graus Celsius: ");
     double celsius = scanner.nextDouble();

     double fahrenheit = (9 * celsius + 160) / 5;

     System.out.printf("A temperatura em Fahrenheit é: %.2f\n", fahrenheit);

     scanner.close();
 }
}
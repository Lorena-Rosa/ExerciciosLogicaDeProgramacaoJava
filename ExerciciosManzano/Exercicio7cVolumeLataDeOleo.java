package ExerciciosManzano;

//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//Volume *Raio * Altura

import java.util.Scanner;

public class Exercicio7cVolumeLataDeOleo {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o valor do raio da base da lata (em cm): ");
     double raio = scanner.nextDouble();

     System.out.print("Digite o valor da altura da lata (em cm): ");
     double altura = scanner.nextDouble();

     double volume = 3.14 * Math.pow(raio, 2) * altura;

     System.out.printf("O volume da lata de óleo é: %.2f cm³\n", volume);

     scanner.close();
 }
}
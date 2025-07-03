package ExerciciosManzano;

//Calcula o volume de uma caixa retangular

import java.util.Scanner;

public class Exercicio7hVolumeCaixa {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Vamos calcular o volume de uma caixa!");

     System.out.print("Digite o comprimento da caixa (em cm): ");
     double comprimento = scanner.nextDouble();

     System.out.print("Digite a largura da caixa (em cm): ");
     double largura = scanner.nextDouble();

     System.out.print("Digite a altura da caixa (em cm): ");
     double altura = scanner.nextDouble();

     double volume = comprimento * largura * altura;

     System.out.printf("Comprimento = %.2fcm; largura = %.2fcm; altura = %.2fcm. Então o volume = %.2f cm³\n",
                       comprimento, largura, altura, volume);

     scanner.close();
 }
}
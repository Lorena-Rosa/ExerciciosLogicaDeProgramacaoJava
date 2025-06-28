package exerciciosFaccat;

//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.

import java.util.Scanner;

public class Exercicio8Eleicao {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o número total de votos da sua cidade: ");
     int totalVotos = scanner.nextInt();

     System.out.print("Digite a quantidade de votos nulos: ");
     int votosNulos = scanner.nextInt();

     System.out.print("Digite a quantidade de votos brancos: ");
     int votosBrancos = scanner.nextInt();

     int votosValidos = totalVotos - (votosNulos + votosBrancos);

     double porcentNulos = (double) votosNulos / totalVotos * 100;
     double porcentBrancos = (double) votosBrancos / totalVotos * 100;
     double porcentValidos = (double) votosValidos / totalVotos * 100;

     System.out.printf("A porcentagem de votos brancos é: %.2f%%, a de votos nulos é: %.2f%% e a de votos válidos é de: %.2f%%\n",
                       porcentBrancos, porcentNulos, porcentValidos);

     scanner.close();
 }
}

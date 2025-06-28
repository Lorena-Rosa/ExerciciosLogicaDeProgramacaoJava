package exerciciosFaccat;

//Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos
//brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total
//de eleitores.

import java.util.Scanner;

public class Exercicio8Eleicao {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o n�mero total de votos da sua cidade: ");
     int totalVotos = scanner.nextInt();

     System.out.print("Digite a quantidade de votos nulos: ");
     int votosNulos = scanner.nextInt();

     System.out.print("Digite a quantidade de votos brancos: ");
     int votosBrancos = scanner.nextInt();

     int votosValidos = totalVotos - (votosNulos + votosBrancos);

     double porcentNulos = (double) votosNulos / totalVotos * 100;
     double porcentBrancos = (double) votosBrancos / totalVotos * 100;
     double porcentValidos = (double) votosValidos / totalVotos * 100;

     System.out.printf("A porcentagem de votos brancos �: %.2f%%, a de votos nulos �: %.2f%% e a de votos v�lidos � de: %.2f%%\n",
                       porcentBrancos, porcentNulos, porcentValidos);

     scanner.close();
 }
}

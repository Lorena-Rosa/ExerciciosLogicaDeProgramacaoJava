package ExerciciosManzano;

//Exibe o módulo de um número digitado

import java.util.Scanner;

public class L02BModuloValor {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor inteiro: ");
     int valor = scanner.nextInt();

     if (valor < 0) {
         valor = valor * (-1);
     }

     System.out.println("O módulo do valor digitado é: " + valor);

     scanner.close();
 }
}
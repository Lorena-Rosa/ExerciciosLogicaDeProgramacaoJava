package ExerciciosManzano;

//Exibe o m�dulo de um n�mero digitado

import java.util.Scanner;

public class L02BModuloValor {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor inteiro: ");
     int valor = scanner.nextInt();

     if (valor < 0) {
         valor = valor * (-1);
     }

     System.out.println("O m�dulo do valor digitado �: " + valor);

     scanner.close();
 }
}
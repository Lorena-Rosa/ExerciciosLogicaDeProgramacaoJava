package ExerciciosManzano;

//Calcula a diferença entre dois valores e mostra quem é o maior

import java.util.Scanner;

public class L02ADiferencaEntreMaiorEMenor {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um valor: ");
     double valor1 = scanner.nextDouble();

     System.out.print("Digite outro valor: ");
     double valor2 = scanner.nextDouble();

     double diferenca;
     if (valor1 >= valor2) {
         diferenca = valor1 - valor2;
         System.out.printf("A diferença entre o maior valor (%.2f) e o menor valor (%.2f) é: %.2f\n",
                           valor1, valor2, diferenca);
     } else {
         diferenca = valor2 - valor1;
         System.out.printf("A diferença entre o maior valor (%.2f) e o menor valor (%.2f) é: %.2f\n",
                           valor2, valor1, diferenca);
     }

     scanner.close();
 }
}
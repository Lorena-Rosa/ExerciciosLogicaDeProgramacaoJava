package exerciciosFaccat;

//A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais
//de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50%.
//Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva
//o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o m�s possua 4 semanas exatas).

import java.util.Scanner;

public class Exercicio22JornadaTrabalho {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Quantas horas o funcion�rio trabalhou no m�s? ");
     int horasTrabalhadas = scanner.nextInt();

     System.out.print("Qual o sal�rio por hora? ");
     double salarioHora = scanner.nextDouble();

     double salarioTotal;

     if (horasTrabalhadas < 161) {
         salarioTotal = horasTrabalhadas * salarioHora;
     } else {
         salarioTotal = 160 * salarioHora + (horasTrabalhadas - 160) * (salarioHora * 1.5);
     }

     System.out.printf("O sal�rio total � de: R$%.2f\n", salarioTotal);

     scanner.close();
 }
}
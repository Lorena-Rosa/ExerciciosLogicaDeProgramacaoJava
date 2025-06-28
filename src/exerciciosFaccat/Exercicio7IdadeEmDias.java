package exerciciosFaccat;

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias

import java.util.Scanner;

public class Exercicio7IdadeEmDias {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Insira sua idade expressa em anos: ");
     int anos = scanner.nextInt();

     System.out.print("Insira quantos meses fazem desde seu último aniversário: ");
     int meses = scanner.nextInt();

     System.out.print("Insira quantos dias faltam para o seu próximo mesversário: ");
     int dias = scanner.nextInt();

     int idadeEmDias = (anos * 365) + (meses * 30) + 30 - dias;

     System.out.println("A sua idade convertida em dias é: " + idadeEmDias + " dias");

     scanner.close();
 }
}
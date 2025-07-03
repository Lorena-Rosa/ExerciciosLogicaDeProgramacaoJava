package exerciciosFaccat;
 
import java.util.Scanner;

// Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém
//erros, identifique os erros no algoritmo apresentado abaixo:
//Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
//e mostre seu peso ideal, utilizando as seguintes fórmulas:
//- para sexo masculino: peso ideal = (72.7 * altura) - 58
//- para sexo feminino: peso ideal = (62.1 * altura) - 44.7


public class Exercicio23PesoIdeal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Qual seu nome? ");
     String nome = scanner.nextLine();

     System.out.print("Você é do sexo feminino ou masculino? ");
     String sexo = scanner.nextLine().toLowerCase();

     System.out.print("Qual sua altura? ");
     double altura = scanner.nextDouble();

     double pesoIdeal;
     if (sexo.equals("masculino")) {
         pesoIdeal = (72.7 * altura) - 58;
     } else {
         pesoIdeal = (62.1 * altura) - 44.7;
     }

     System.out.printf("%s, o seu peso ideal é: %.2fkg.\n", nome, pesoIdeal);
     scanner.close();
 }
}
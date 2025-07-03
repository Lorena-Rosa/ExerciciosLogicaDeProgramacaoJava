package exerciciosFaccat;



import java.util.Scanner;

public class Exercicio41MediaDeAproveitamento {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite a nota da primeira verifica��o (0-10): ");
     double nota1 = scanner.nextDouble();

     System.out.print("Digite a nota da segunda verifica��o (0-10): ");
     double nota2 = scanner.nextDouble();

     System.out.print("Digite a nota da terceira verifica��o (0-10): ");
     double nota3 = scanner.nextDouble();

     System.out.print("Digite a m�dia dos exerc�cios (0-10): ");
     double mediaExercicios = scanner.nextDouble();

     double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;
     String conceito;

     if (mediaAproveitamento >= 9) {
         conceito = "A";
     } else if (mediaAproveitamento >= 7.5) {
         conceito = "B";
     } else if (mediaAproveitamento >= 6) {
         conceito = "C";
     } else {
         conceito = "D";
     }

     System.out.printf("A m�dia de aproveitamento foi: %.2f, logo o conceito = %s\n",
                       mediaAproveitamento, conceito);

     scanner.close();
 }
}
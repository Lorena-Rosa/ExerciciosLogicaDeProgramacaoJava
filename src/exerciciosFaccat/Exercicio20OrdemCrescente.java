package exerciciosFaccat;

// Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrev�-los em ordem crescente.

	import java.util.Scanner;

	public class Exercicio20OrdemCrescente {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um valor: ");
	        double valor1 = scanner.nextDouble();

	        System.out.print("Digite outro valor: ");
	        double valor2 = scanner.nextDouble();

	        if (valor1 == valor2) {
	            System.out.println("Os n�meros digitados n�o podem ser iguais.");
	        } else {
	            if (valor1 > valor2) {
	                System.out.println("Os n�meros digitados em ordem crescente: " + valor2 + ", " + valor1);
	            } else {
	                System.out.println("Os n�meros digitados em ordem crescente: " + valor1 + ", " + valor2);
	            }
	        }

	        scanner.close();
	    }
	}	

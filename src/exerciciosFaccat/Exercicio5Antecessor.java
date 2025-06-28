package exerciciosFaccat;
import java.util.Scanner;

//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

public class Exercicio5Antecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int antecessor = numero - 1;

        System.out.println("O antecessor de " + numero + " é igual a: " + antecessor);
        scanner.close();
    }
}
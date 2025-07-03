package ExerciciosManzano;

//Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um 
//automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto 
//(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a 
//distância percorrida com a fórmula DISTANCIA  TEMPO * VELOCIDADE. Possuindo o valor da 
//distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula 
//LITROS_USADOS  DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade 
//média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a 
//quantidade de litros (LITROS_USADOS) utilizada na viagem

import java.util.Scanner;

public class Exercicio7dViagem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o tempo de duração da viagem (em horas, sem minutos): ");
     int tempoViagem = scanner.nextInt();

     System.out.print("Digite a velocidade média do automóvel durante a viagem (em Km/h): ");
     int velocidade = scanner.nextInt();

     int distancia = tempoViagem * velocidade;
     double litrosUsados = distancia / 12.0;

     System.out.printf("Com a velocidade média de %dKm/h, o automóvel percorreu %dKm em %dh com %.2fL de combustível.\n",
                       velocidade, distancia, tempoViagem, litrosUsados);

     scanner.close();
 }
}
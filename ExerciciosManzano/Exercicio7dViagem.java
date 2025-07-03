package ExerciciosManzano;

//Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um 
//autom�vel que faz 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto 
//(TEMPO) e a velocidade m�dia (VELOCIDADE) durante a viagem. Desta forma, ser� poss�vel obter a 
//dist�ncia percorrida com a f�rmula DISTANCIA  TEMPO * VELOCIDADE. Possuindo o valor da 
//dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula 
//LITROS_USADOS  DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade 
//m�dia (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a 
//quantidade de litros (LITROS_USADOS) utilizada na viagem

import java.util.Scanner;

public class Exercicio7dViagem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o tempo de dura��o da viagem (em horas, sem minutos): ");
     int tempoViagem = scanner.nextInt();

     System.out.print("Digite a velocidade m�dia do autom�vel durante a viagem (em Km/h): ");
     int velocidade = scanner.nextInt();

     int distancia = tempoViagem * velocidade;
     double litrosUsados = distancia / 12.0;

     System.out.printf("Com a velocidade m�dia de %dKm/h, o autom�vel percorreu %dKm em %dh com %.2fL de combust�vel.\n",
                       velocidade, distancia, tempoViagem, litrosUsados);

     scanner.close();
 }
}
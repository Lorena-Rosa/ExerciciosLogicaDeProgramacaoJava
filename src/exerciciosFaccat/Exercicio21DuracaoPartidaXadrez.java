package exerciciosFaccat;

//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte

import java.util.Scanner;

public class Exercicio21DuracaoPartidaXadrez {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite a hora do início do jogo (00-23): ");
     int horaInicio = scanner.nextInt();

     System.out.print("Digite a hora do fim do jogo (00-23): ");
     int horaFim = scanner.nextInt();

     int duracao;

     if (horaInicio == horaFim) {
         duracao = 24;
     } else if (horaFim > horaInicio) {
         duracao = horaFim - horaInicio;
     } else {
         duracao = (24 - horaInicio) + horaFim;
     }

     System.out.println("A duração do jogo foi de " + duracao + " horas.");

     scanner.close();
 }
}
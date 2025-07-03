package exerciciosFaccat;

//Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o. Para
//estar em condi��es, um dos seguintes requisitos deve ser satisfeito:
//- Ter no m�nimo 65 anos de idade.
//- Ter trabalhado no m�nimo 30 anos.
//- Ter no m�nimo 60 anos e ter trabalhado no m�nimo 25 anos.
//Com base nas informa��es acima, fa�a um algoritmo que leia: o n�mero do empregado (c�digo), o ano
//de seu nascimento e o ano de seu ingresso na empresa. O programa dever� escrever a idade e o tempo
//de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'.

import java.util.Scanner;

public class Exercicio42Aposentadoria {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite qual o n�mero do(a) funcion�rio(a) (c�digo): ");
     int codigo = scanner.nextInt();

     System.out.print("Digite o ano em que estamos: ");
     int anoAtual = scanner.nextInt();

     System.out.print("Digite o ano de nascimento do(a) funcion�rio(a): ");
     int anoNascimento = scanner.nextInt();

     System.out.print("Digite em que ano o(a) funcion�rio(a) ingressou na empresa: ");
     int anoEmpresa = scanner.nextInt();

     int idadeFuncionario = anoAtual - anoNascimento;
     int anosTrabalhados = anoAtual - anoEmpresa;

     if (idadeFuncionario >= 65 || anosTrabalhados >= 30 || (idadeFuncionario >= 60 && anosTrabalhados >= 25)) {
         System.out.println("O(A) funcion�rio(a) " + codigo + " tem " + idadeFuncionario +
                            " anos e faz " + anosTrabalhados + " anos que ingressou na empresa, logo: Requer aposentadoria.");
     } else if (anoAtual < anoNascimento || anoAtual < anoEmpresa || idadeFuncionario < 18) {
         System.out.println("Resposta inv�lida.");
     } else {
         System.out.println("O(A) funcion�rio(a) " + codigo + " tem " + idadeFuncionario +
                            " anos e faz " + anosTrabalhados + " anos que ingressou na empresa, logo: N�o requer aposentadoria.");
     }

     scanner.close();
 }
}
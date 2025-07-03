package exerciciosFaccat;

//Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
//estar em condições, um dos seguintes requisitos deve ser satisfeito:
//- Ter no mínimo 65 anos de idade.
//- Ter trabalhado no mínimo 30 anos.
//- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
//Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
//de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
//de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.

import java.util.Scanner;

public class Exercicio42Aposentadoria {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Digite qual o número do(a) funcionário(a) (código): ");
     int codigo = scanner.nextInt();

     System.out.print("Digite o ano em que estamos: ");
     int anoAtual = scanner.nextInt();

     System.out.print("Digite o ano de nascimento do(a) funcionário(a): ");
     int anoNascimento = scanner.nextInt();

     System.out.print("Digite em que ano o(a) funcionário(a) ingressou na empresa: ");
     int anoEmpresa = scanner.nextInt();

     int idadeFuncionario = anoAtual - anoNascimento;
     int anosTrabalhados = anoAtual - anoEmpresa;

     if (idadeFuncionario >= 65 || anosTrabalhados >= 30 || (idadeFuncionario >= 60 && anosTrabalhados >= 25)) {
         System.out.println("O(A) funcionário(a) " + codigo + " tem " + idadeFuncionario +
                            " anos e faz " + anosTrabalhados + " anos que ingressou na empresa, logo: Requer aposentadoria.");
     } else if (anoAtual < anoNascimento || anoAtual < anoEmpresa || idadeFuncionario < 18) {
         System.out.println("Resposta inválida.");
     } else {
         System.out.println("O(A) funcionário(a) " + codigo + " tem " + idadeFuncionario +
                            " anos e faz " + anosTrabalhados + " anos que ingressou na empresa, logo: Não requer aposentadoria.");
     }

     scanner.close();
 }
}
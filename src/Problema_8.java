import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Calcule e mostre o total do seu salário no referido mês.
* Descrição: 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
  no mês. Calcule e mostre o total do seu salário no referido mês.
* Data: 09/04/2023 */

public class Problema_8 {

        public static void main(String[] args) {

          Scanner num = new Scanner(System.in);

          System.out.println("Digite o valor da sua hora de trabalho: ");
          float valordahora = num.nextFloat();

          System.out.println("Digite quantas horas voce trabalha por dia: ");
          int horastrabalhadas = num.nextInt();

          int quantidadededias = 30; //estimativa de dias úteis em um mês
          float hporMes = ((valordahora * horastrabalhadas) * quantidadededias);

          System.out.printf("> O seu salario em um mes é de: %.2f", hporMes);

         num.close();
        }
      
      }



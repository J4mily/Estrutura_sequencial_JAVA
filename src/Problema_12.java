import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Peso ideal.
* Descrição: 12.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal
, usando a seguinte fórmula: (72.7*altura) - 58
* Data: 09/04/2023 */

public class Problema_12 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
       
    System.out.print("Qual a sua altura? ");
    double altura = entrada.nextDouble();

    System.out.print("O seu peso ideal é: " + ((72.7*altura) - 58));
    entrada.close();
   }

}

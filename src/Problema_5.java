import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Programa que pergunte ao usuário um valor em metros e converta o valor digitado.
* Descrição: 5. Faça um Programa que pergunte ao usuário um valor em metros e converta o valor digitado para centímetros.
* Data: 09/04/2023 */

public class Problema_5 {

        public static void main(String args[]){
       
         Scanner val = new Scanner(System.in);
       
         System.out.print("Quantos metros? ");
         float metros = val.nextFloat();
       
         float centimetros = metros * 100;
       
         System.out.printf("> Isso equivale a: %.1f cm",centimetros);
       
         val.close();
       }
}

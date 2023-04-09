import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Programa que peça para o usuário digitar 4 notas de avaliação bimestrais e mostre a soma total. 
* Descrição: 4. Faça um Programa que peça para o usuário digitar 4 notas de
  avaliação bimestrais e mostre a soma total das notas e a sua média.
* Data: 09/04/2023 */

public class Problema_4 {
   public static void main(String args[]){
   Scanner num = new Scanner(System.in);
      
   System.out.println("Digite a Nota 1? ");
   float n1 = num.nextInt();
   System.out.println("Digite a Nota 2? ");
   float n2 = num.nextInt();
   System.out.println("Digite a Nota 3? ");
   float n3 = num.nextInt();
   System.out.println("Digite a Nota 4? ");
   float n4 = num.nextInt();

   float soma = (n1+n2+n3+n4);
   float media = soma/4;

   System.out.println("> A soma das suas notas corresponde a:  " + soma);
   System.out.println("> A sua média corresponde a: " + media);

   num.close();
  }
}

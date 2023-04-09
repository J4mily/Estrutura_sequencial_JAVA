import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Calculo a área de um quadrado.
* Descrição: 7.Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
* Data: 09/04/2023 */

public class Problema_7 {
   public static void main(String args[]){
       
    Scanner val = new Scanner(System.in);
  
    System.out.print("Qual o valor de um dos lados do quadrado? ");
    float vlQuadrado = val.nextFloat();

     System.out.println("> A área do quadrado é: " + (vlQuadrado * vlQuadrado));
     System.out.println("> O dobro dessa área correesponde a: " + (vlQuadrado * vlQuadrado)*2);

     val.close();
}


}

import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: raio de um círculo => área do círculo.
* Descrição: 6.Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
* Data: 09/04/2023 */

public class Problema_6 {
    public static void main(String args[]){
       
        Scanner val = new Scanner(System.in);
      
        System.out.print("Qual o raio do circulo? ");
        float vlRaio = val.nextFloat();

         System.out.print("> A área do círculo é: " + (vlRaio * vlRaio)* Math.PI);

         val.close();
    }
}

import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Programa que peça um número e então mostre o mesmo.
* Descrição: 2. Faça um Programa que peça um número e então mostre a mensagem o número informado foi [número].
* Data: 09/04/2023 */

public class Problema_2 {

    public static void main(String args[]){
   
     Scanner num = new Scanner(System.in);
   
     System.out.println("Qual número deseja visualizar? ");
     int numero = num.nextInt();
   
     System.out.println("> O número informado foi [" + numero + "]");
     num.close();
   
    }
   }
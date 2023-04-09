import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Programa que peça dois números e imprima a soma.
* Descrição: 3.Faça um Programa que peça dois números e imprima a soma.
* Data: 09/04/2023 */

public class Problema_3 {

    public static void main(String args[]){
   
        Scanner num = new Scanner(System.in);
      
        System.out.println("Digite um número: ");
        int num1 = num.nextInt();

        System.out.println("Digite um segundo número: ");
        int num2 = num.nextInt();

        System.out.println("> A soma desses números é: " + (num1 + num2));
  
        num.close();

    }
}

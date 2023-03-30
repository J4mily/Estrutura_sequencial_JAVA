import java.util.Scanner;

public class Problema_2 {
	//2. Faça um Programa que peça um número e então mostre a mensagem
    //O número informado foi [número].

    public static void main(String args[]){
   
     Scanner num = new Scanner(System.in);
   
     System.out.println("Qual número deseja visualizar? ");
     int numero = num.nextInt();
   
     System.out.println("O número informado foi [" + numero + "]");
     num.close();
   
    }
   }
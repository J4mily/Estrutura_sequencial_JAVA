import java.util.Scanner;

public class Problema_6 {
    // 6.Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
    public static void main(String args[]){
       
        Scanner val = new Scanner(System.in);
      
        System.out.print("Qual o raio do circulo? ");
        float vlRaio = val.nextFloat();

         System.out.print("A área do círculo é: " + (vlRaio * vlRaio)* Math.PI);

         val.close();
    }
}

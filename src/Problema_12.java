import java.util.Scanner;

public class Problema_12 {
   //12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
       
    System.out.print("Qual a sua altura? ");
    double altura = entrada.nextDouble();

    System.out.print("O seu peso ideal é: " + ((72.7*altura) - 58));
    entrada.close();
   }

}

import java.util.Scanner;

public class Problema_13 {
    //13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
    // Para homens: (72.7*h) - 58
    // Para mulheres: (62.1*h) - 44.7

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    System.out.print("Qual a sua altura? ");
    double altura = entrada.nextDouble();

    System.out.println("O seu peso ideal caso você seja HOMEM é: " + ((72.7 * altura) - 58));
    System.out.println("O seu peso ideal caso você seja MULHER é: " + ((62.1 * altura) - 44.7));
    entrada.close();

    }

    
}

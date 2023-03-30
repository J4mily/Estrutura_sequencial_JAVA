import java.util.Scanner;

public class Problema_11 {
    //11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    //o produto do dobro do primeiro com metade do segundo .
    //a soma do triplo do primeiro com o terceiro.
    //o terceiro elevado ao cubo.

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
       
    System.out.print("Digite um número inteiro: ");
    int n1Inteiro = entrada.nextInt();

    System.out.print("Digite um número inteiro: ");
    int n2Inteiro = entrada.nextInt();

    System.out.print("Digite um número inteiro: ");
    double n1Real = entrada.nextDouble();

    System.out.println("O produto do dobro do primeiro com metade do segundo equivale a: " + ((n1Inteiro * 2) * (n2Inteiro/2)));
    System.out.println("A soma do triplo do primeiro com o terceiro equivale a:  " + ((n1Inteiro * 3) + n1Real));
    System.out.println("O terceiro elevado ao cubo equivale a:  " + Math.pow(n1Real,3));
    //(n1Real * n1Real * n1Real) é o mesmo que Math.pow(x, y);

    entrada.close();

}
}





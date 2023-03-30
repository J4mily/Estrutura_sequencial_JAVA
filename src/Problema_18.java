import java.util.Scanner;

public class Problema_18 {
    //18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de 
    //Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
   
    public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Informe o tamanho do arquivo para download em MB:");
        double tamanho = s.nextDouble();

        System.out.print("Informe a velocidade do link em Mbps:");
        double velocidade = s.nextDouble();

        double tempo = tamanho / velocidade;
        double min = tempo/60;

        System.out.printf("O tempo aproximado de download do arquivo em minutos será de %.2f minutos.",min);

        s.close();


    }

}

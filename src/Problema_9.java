import java.util.Scanner;

public class Problema_9 {
    //9. Faça um Programa que peça a temperatura em graus Fahrenheit,
    //transforme e mostre a temperatura em graus Celsius.
    //C = 5 * ((F-32) / 9).
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Celsius\n\n"); 
		
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double Fahrenheit = entrada.nextDouble();
		

		double Celsius = 5 * (( Fahrenheit - 32 ) / 9);

		System.out.print("\n A medida convertida é " + Celsius + " ºC\n");

        entrada.close();
		
	}

}

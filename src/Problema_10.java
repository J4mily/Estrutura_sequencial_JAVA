import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Celsius => Fahrenheit.
* Descrição: 10.Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
* Data: 09/04/2023 */

public class Problema_10 {
    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n\n"); 
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		double Celsius = entrada.nextDouble();
		
		double Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print("\n> A medida convertida é " + Fahrenheit + " ºF\n");
		
        entrada.close();
	}

}

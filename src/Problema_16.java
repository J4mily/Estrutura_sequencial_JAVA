import java.util.Scanner;

public class Problema_16 {
    //7. Faça um programa para uma loja de tintas. O programa deverá
    //pedir o tamanho em metros quadrados da área a ser pintada.
    //Considere que a cobertura da tinta é de 1 litro para cada 3
    //metros quadrados e que a tinta é vendida em latas de 18
    //litros, que custam R$ 80,00. Informe ao usuário a quantidades
    //de latas de tinta a serem compradas e o preço total.
    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a área em M2 que será pintada? ");
        float area = entrada.nextFloat();
        //Atenção a notação:
        //ceil é igual ou maior
        //round é o inteiro mais próximo 
        //floor é igual ou menor

        //float qntlatas = (float) Math.ceil((area / 3) / 18);
        float qntlatas = (float) Math.ceil(area / 54);
        float preço = qntlatas * 80;

        System.out.println("Latas: " + qntlatas + " unidades.");
        System.out.println("Preço: " + preço + " Reais.");

        entrada.close();

    }



    
}

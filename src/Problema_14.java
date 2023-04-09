import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Rendimento diário  de pesca.
* Descrição: 14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário 
    //de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de 
    //pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
    //João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
    //Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa 
    //que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
* Data: 09/04/2023 */

public class Problema_14 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    System.out.print("Quantos kgs de peixe temos? ");
    double pesoPeixe = entrada.nextDouble();

    if(pesoPeixe <= 50){
        System.out.println("> Peso adequado!");
    }else{
        double excesso = (pesoPeixe - 50);
        System.out.println("> O peso excedeu  limite em "+ excesso +"Kgs, valor da Multa: " + (excesso * 4) + " Reais.");
    }

    entrada.close();
    
   
   

    }
}

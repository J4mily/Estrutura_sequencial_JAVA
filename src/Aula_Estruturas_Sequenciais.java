import java.util.Scanner;

public class Aula_Estruturas_Sequenciais {

    //link da atividade: https://wiki.python.org.br/EstruturaSequencial
    
    //Ex da resolução das atividades:
    //Faça um Programa que pergunte ao usuário o seu nome e, em
    //seguida, mostre o nome do usuário na tela.
    public static void main(String args[]){
   
        Scanner num = new Scanner(System.in);
      
        System.out.println("Qual o seu nome? ");
        String nome = num.nextLine();
      
        System.out.println("O nome dito foi: " + nome + ".");
        num.close();
      
       }

}

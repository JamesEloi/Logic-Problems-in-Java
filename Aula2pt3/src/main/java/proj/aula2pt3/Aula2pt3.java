package proj.aula2pt3;

import java.util.Scanner;


public class Aula2pt3 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String nome;
        int celular;
        double salario;
        System.out.println("Qual o seu nome? ");
        nome = sc2.nextLine();//Recebe o nome
        System.out.println("Qual o seu Celular? ");
        celular = sc1.nextInt(); //Entrada de numeros inteiros
        System.out.println("Qual o seu salario? ");
        salario = sc1.nextDouble(); //Entrada de numeros flutuantes
        
        System.out.println("Nome: " + nome);
        System.out.print("Celular: " + celular);
        System.out.println("                     Salario: " + salario);
        
    }
}

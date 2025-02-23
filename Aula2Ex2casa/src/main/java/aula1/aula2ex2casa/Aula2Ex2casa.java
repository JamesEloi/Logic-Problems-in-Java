package aula1.aula2ex2casa;

import java.util.Scanner;

public class Aula2Ex2casa {

    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in); 
        
        String nome;
        int idade;
        float peso;
        
        System.out.println("Qual seu nome? ");
        nome = sc1.nextLine();
        System.out.println("Qual sua idade? ");
        idade = sc1.nextInt();
        System.out.println("qual é seu peso? ");
        peso = sc1.nextFloat();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}
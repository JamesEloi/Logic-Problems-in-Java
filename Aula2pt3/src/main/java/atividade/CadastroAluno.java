package atividade;
import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu RA: ");
        int codigoRa = sc.nextInt();sc.nextLine();
        System.out.println("Digite Seu curso: ");
        String curso = sc.nextLine();
        
        System.out.println("Nome:  " + nome);
        System.out.println("RA:  " + codigoRa);
        System.out.println("curso:  " + curso);
       
        
    }
    
}

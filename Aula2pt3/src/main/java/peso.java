
import java.util.Scanner;
public class peso {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();
        
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
        System.out.println("Peso = " + peso);
    } 
}

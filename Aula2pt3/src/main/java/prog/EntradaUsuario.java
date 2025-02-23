package prog;
import java.util.Scanner;
public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu Genero se e (M) ou (F): ");
        char sexo = sc.next().charAt(0);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu Celular: ");
        int cell = sc.nextInt();
        System.out.println("Digite seu Codigo: ");
        float cod = sc.nextFloat();
        
        System.out.println("Nome:  " + nome);
        System.out.println("Sexo:  " + sexo);
        System.out.println("Idade:  " + idade);
        System.out.println("Celular:   " + cell);
        System.out.println("cod:   " + cod);
        
        
        
    }
    
}

import java.util.Scanner;
public class repetido1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Fale seu nome por favor: ");
        String nome = sc1.nextLine();
        System.out.print("Fale sua idade por favor: ");
        int idade = sc1.nextInt();
        System.out.print("Fala seu numero de Telefone: ");
        int telefone = sc1.nextLine();
        
        System.out.println("Seu nome é: "+ nome);
        System.out.println("Sua idade é: "+ idade);
        System.out.println("Seu telefone é: " + telefone);
        
    }
    
}

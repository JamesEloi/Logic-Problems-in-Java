package exercicios.lanche;
import java.util.Scanner;
public class Lanche {

    public static void main(String[] args) 
    {
      Scanner read = new Scanner(System.in);
      int quantia = 0;
      double conta = 0;
      double valor = 0;
      System.out.println("Digite um codigo de 1 a 5");
      System.out.println("Correspondente ao lanche: ");
        int menu = read.nextInt();
        switch(menu)
        {
            case 1:
                System.out.println("1 - Cachorro Quente\n");
                System.out.println("Vai querer quantos?\n");
                quantia = read.nextInt(); 
                valor = 4.00;
            break;      
            case 2: 
                 System.out.println("2 - X-Salada\n");
                 System.out.println("Vai querer quantos?\n");
                 quantia = read.nextInt();
                 valor = 4.50;
            break;  
            case 3: 
                 System.out.println("3 - X-Bacon\n");
                 System.out.println("Vai querer quantos?\n");
                 quantia = read.nextInt();
                 valor = 5.00;
            break;  
            case 4:
                  System.out.println("4 - Torrada Simples\n");
                  System.out.println("Vai querer quantos?\n");
                  quantia = read.nextInt();
                  valor = 2.00;
            break;  
            case 5:
                  System.out.println("5 - Refrigerante\n");
                  System.out.println("Vai querer quantos?\n");
                  quantia = read.nextInt();
                  valor = 1.50;
            break; 
            default: 
                System.out.println("Essa opcao nao existe");
                break;
        }
          System.out.println("\n");
          conta = quantia*valor;
          System.out.printf("Total: R$ %.2f\n",conta);
    }
}

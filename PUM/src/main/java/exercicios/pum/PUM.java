package exercicios.pum;
import java.util.Scanner;
public class PUM {

    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      int saidas = read.nextInt();
      int contador = 4;
      int numeros_lista = 0;
      for(int o = 0; o < saidas; o++)
      {
          for(int i = 1; i < contador; i++)
          {
              numeros_lista += 1;
              System.out.print(numeros_lista+" ");
          }
              System.out.println("PUM");
              numeros_lista += 1;
      }
    }
}

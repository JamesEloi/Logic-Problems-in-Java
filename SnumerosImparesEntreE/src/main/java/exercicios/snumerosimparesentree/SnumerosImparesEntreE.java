package exercicios.snumerosimparesentree;
import java.util.Scanner;
public class SnumerosImparesEntreE {

    public static void main(String[] args)
    {
      Scanner read = new Scanner(System.in);
      int x = read.nextInt();
      int y = read.nextInt();
      int somatorioI = 0;
      if (x < y)
      {
            for(int i = x+1; i > x && i < y; i++)
            {  
                if(i%2 != 0)
                {
                  somatorioI += i;
                } 
            }
      }
      else
      {
      for(int i = y+1; i > y && i < x; i++)
            {
                if(i%2!=0)
                {
                  somatorioI += i;
                } 
            }
      }
      
        System.out.println(somatorioI);
    }
}

package exercicios.checagemvalorespositivos2;
import java.util.Scanner;
public class ChecagemValoresPositivos2 {

    public static void main(String[] args) 
    {
         Scanner read = new Scanner(System.in);
        int contagem_de_positivos = 0;
        for(int i = 1; i <= 6; i++)
        {
          int inteiro = read.nextInt();
          while (inteiro == 0)
          {
               inteiro = read.nextInt();
          }  
          if(inteiro > 0)
          {
             contagem_de_positivos += 1;
          }
          
        } 
        System.out.println(contagem_de_positivos+" valores positivos");
        
        
               
    }
}

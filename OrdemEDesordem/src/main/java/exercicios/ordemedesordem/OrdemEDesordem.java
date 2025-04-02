package exercicios.ordemedesordem;
import java.util.Scanner;
public class OrdemEDesordem {

    public static void main(String[] args) 
    {
      Scanner read = new Scanner(System.in);
      int entrada1 = read.nextInt();
      int entrada2 = read.nextInt();
      int entrada3 = read.nextInt();
      
      if(entrada1 < entrada2 && entrada2 < entrada3)
      {
          System.out.println(entrada1);
          System.out.println(entrada2);
          System.out.println(entrada3);
      }
      else if(entrada2 < entrada1 && entrada1 < entrada3)
      {
          System.out.println(entrada2);
          System.out.println(entrada1);
          System.out.println(entrada3);
      }
      else if(entrada3 < entrada1 && entrada1 < entrada2)
      {
          System.out.println(entrada3);
          System.out.println(entrada1);
          System.out.println(entrada2);
      }
      else if(entrada1 < entrada3 && entrada3 < entrada2)
      {
          System.out.println(entrada1);
          System.out.println(entrada3);
          System.out.println(entrada2);
      }
         
     else if(entrada2 < entrada3 && entrada3 < entrada1)
     {
          System.out.println(entrada2);
          System.out.println(entrada3);
          System.out.println(entrada1);
     }      
     
     else if(entrada3 < entrada2 && entrada2 < entrada1)
     {
          System.out.println(entrada3);
          System.out.println(entrada2);
          System.out.println(entrada1);
     }
      
      System.out.println("");     
      System.out.println(entrada1);
      System.out.println(entrada2);
      System.out.println(entrada3); 
    }
}

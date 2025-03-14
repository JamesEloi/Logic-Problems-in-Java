package exercicios.cedulas;

import java.util.Scanner;

public class Cedulas {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double num = ler.nextDouble();
       int unity = 0; 
       double cNota50 = (num/10) %2;         
       if (num >= 100 && cNota50==0)
       {
          for(int count=0; count < num; count += 100)
          {
                      
                      unity++;
          }
       System.out.println(unity+" notas de R$ 100");  /*inicialiso a variaveil que conta as cedulas com 0 */ unity=0;
       }
      
       if(num > 100 && cNota50!=0)
       {
           double operador = num - 50;
           for(int count=0; count < operador; count += 100)
          {
                      
                      unity++;
          }
       
       
       
           System.out.println(unity+" notas de R$ 100");  /*inicialiso a variaveil que conta as cedulas com 0 */ unity=0;
           for(int count=0; count < 50; count += 50)
          {
           
           unity++;
       
          }
           
           System.out.println(unity+" nota de 50"); 
      }
       
     
       double note20 = num - (num -20);
       double calculo = 0;
       
       for(int count = note20; count < num; count += 20)       
       {
       
       }              
    }
}

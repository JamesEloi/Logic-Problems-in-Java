package exercicios.primos;

import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
          int i = 2;
          int e = 2;
          int quantidade = 0;
          int flag = 0;
        // falo para o usuario entrar com dois valores, um menor e o outro maior
        System.out.println("Entre com um numero menor: ");
        //valor menor <
        int valor1 = read.nextInt();
        System.out.println("Entre com um numero maior: ");
        //valor maior >
        int valor2 = read.nextInt();
        
      
        while(valor1 < valor2)
        {
                while(i < valor1)
                {   
                   if(valor1%i==0 && i > 2)
                   { 
                        flag = 1;  
                   }
                    i++;
                }

                 if(flag != 1)
                 {
                     System.out.println(valor1);
                     
                 }
       
                 flag=0;
                 valor1++;
                 i=2;
        }         
            
            
            
        }        
    }


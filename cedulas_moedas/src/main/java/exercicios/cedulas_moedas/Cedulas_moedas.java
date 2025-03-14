
package exercicios.cedulas_moedas;

import java.util.Scanner;

public class Cedulas_moedas {
   
      public static void main(String[] args) {
   
      Scanner read = new Scanner(System.in);
     //operation to transform the value in a reduced number of cedules
      float value = read.nextFloat();
      float cedula_100 = 0;
      cedula_100 = value/100;
      float resto = value%100;
      float cedula_50 = resto/50;
      resto = resto%50;
      float cedula_20 = resto/20;
      resto = resto%20;
      float cedula_10 = resto/10;
      resto = resto%10;
      float cedula_5 = resto/5;
      resto = resto%5;
      float cedula_2 = resto/2;
      resto = resto%2;
      float moeda_real = 0;
      
      //operation to transform the value in a reduced number of cedules
      if(resto > 1.00 && resto <= 1.99)
      {
      moeda_real = (int)resto;
      resto = (resto*100-100)/100; 
      }
      else
      {
      moeda_real = resto;  
      }
          resto = Math.round(resto*100);      
       float moeda_50 = resto/50;
       resto = resto%50;
       float moeda_25 = (resto/25);
       resto = resto%25;
       float moeda_10 = (resto/10);
       resto = resto%10;
       float moeda_5 = (resto/5);
       resto = resto%5;
       float moeda_1 = resto/1;
      
        //here goes the cedules cash
        System.out.println("NOTAS:");
        System.out.println((int)cedula_100+" nota(s) de R$ 100.00");
        System.out.println((int)cedula_50+" nota(s) de R$ 50.00");
        System.out.println((int)cedula_20+" nota(s) de R$ 20.00");
        System.out.println((int)cedula_10+" nota(s) de R$ 10.00");
        System.out.println((int)cedula_5+" nota(s) de R$ 5.00");
        System.out.println((int)cedula_2+" nota(s) de R$ 2.00");
        
        //here goes the coins
          System.out.println("MOEDAS:");
        System.out.println((int)moeda_real+" moeda(s) de R$ 1.00"); 
        System.out.println((int)moeda_50+" moeda(s) de R$ 0.50");
        System.out.println((int)moeda_25+" moeda(s) de R$ 0.25");
        System.out.println((int)moeda_10+" moeda(s) de R$ 0.10");
        System.out.println((int)moeda_5+" moeda(s) de R$ 0.05");
        System.out.println((int)moeda_1+" moeda(s) de R$ 0.01");
    }
}

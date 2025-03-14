
package exercicios.cedulas1;

import java.util.Scanner;

public class Cedulas1 {

    public static void main(String[] args) 
    {
      Scanner read = new Scanner(System.in);
      int value = read.nextInt();
      int cedula_100 = 0;
      cedula_100 = value/100;
      int resto = value%100;
      int cedula_50 = resto/50;
      resto = resto%50;
      int cedula_20 = resto/20;
      resto = resto%20;
      int cedula_10 = resto/10;
      resto = resto%10;
      int cedula_5 = resto/5;
      resto = resto%5;
      int cedula_2 = resto/2;
      resto = resto%2;
      int cedula_1 = resto;
      
        System.out.println(value);
        System.out.println(cedula_100+" nota(s) de R$ 100,00");
        System.out.println(cedula_50+" nota(s) de R$ 50,00");
        System.out.println(cedula_20+" nota(s) de R$ 20,00");
        System.out.println(cedula_10+" nota(s) de R$ 10,00");
        System.out.println(cedula_5+" nota(s) de R$ 5,00");
        System.out.println(cedula_2+" nota(s) de R$ 2,00");
        System.out.println(cedula_1+" nota(s) de R$ 1,00");
    }
}

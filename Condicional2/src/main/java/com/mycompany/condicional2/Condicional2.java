package com.mycompany.condicional2;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Adcione um número: ");
         int num = ler.nextInt();
         int par_impar = num%2;
         //int menor_que_zero = Math.abs(num);
         if(par_impar == 0 && num > 0)
         {
             System.out.println("o numero "+num+" é par");
             System.out.println(" e é positivo");
         }
         else if(par_impar == 0 && num < 0)
         {
             System.out.println("o numero "+num+" é par");
             System.out.println(" e é negativo");
         }
          else if(par_impar > 0  && num > 0)
         {
             System.out.println("o numero "+num+" é impar");
             System.out.println(" e é positivo");
         }
          else if(par_impar == 0 && num < 0)
         {
             System.out.println("o numero "+num+" é impar");
             System.out.println(" e é negativo");
         }
    }
}

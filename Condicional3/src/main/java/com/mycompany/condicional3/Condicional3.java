package com.mycompany.condicional3;

import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = ler.nextInt();
        
        if (num1 > num2){
           System.out.println("o numero "+ num1+" é maior que "+num2);
        }
        
        else if (num1 < num2){
            System.out.println("o numero "+ num1+" é menor que "+num2);
        }
        
        else{
            System.out.println(num1+" e "+num2+" são iguais");
        }
    }
  }

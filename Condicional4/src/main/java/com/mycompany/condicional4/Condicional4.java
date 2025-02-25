package com.mycompany.condicional4;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        System.out.println("Atribua um numero de 1 a 3 para o nivel de ano letivo do professor: ");
        int nivel = ler.nextInt();
        System.out.println("Quantas horas o o professor trabalha? ");
        int horas = ler.nextInt();
        if (nivel ==1)
        {
            double salarioHora = 12.00;
            double salario = horas*salarioHora;
            System.out.printf("Salário = R$%.2f\n", salario);
        }
        
        else if (nivel > 1 && nivel < 3)
        {
            double salarioHora = 17.00;
            double salario = horas*salarioHora;
            System.out.printf("Salário = R$%.2f\n", salario);
        }
        
        else
        {
            double salarioHora = 25.00;
            double salario = horas*salarioHora;
            System.out.printf("Salário = R$%.2f\n", salario);
        }
    }
}

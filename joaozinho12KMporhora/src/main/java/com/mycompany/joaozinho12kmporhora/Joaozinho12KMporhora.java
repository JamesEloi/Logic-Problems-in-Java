package com.mycompany.joaozinho12kmporhora;

import java.util.Scanner;

public class Joaozinho12KMporhora {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float tempo = ler.nextFloat();
        float distancia = ler.nextFloat();
        float quant_Litros = (distancia*tempo)/12;
        
        System.out.printf("%.3f\n", quant_Litros);
    }
}

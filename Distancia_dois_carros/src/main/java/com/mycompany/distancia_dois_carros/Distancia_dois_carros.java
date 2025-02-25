package com.mycompany.distancia_dois_carros;

import java.util.Scanner;

public class Distancia_dois_carros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int distance = ler.nextInt();
        int minutes = distance*2;
        System.out.println("The distance that the car one takes to another car per minute is: "+minutes+ " Minutes");
 
        
    }
}

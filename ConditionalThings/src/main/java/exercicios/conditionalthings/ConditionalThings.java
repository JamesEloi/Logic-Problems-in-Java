package exercicios.conditionalthings;

import java.util.Scanner;

public class ConditionalThings {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter with four values!");
        int A = read.nextInt(); 
        int B = read.nextInt(); 
        int C = read.nextInt(); 
        int D = read.nextInt(); 
        int somaCD = C + D;
        int somaAB = A + B;
        if(B > C && D > A && somaCD > somaAB && C > 0 && D > 0 && A%2==0)
        {
            System.out.println("Valores aceitos!");    
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }    
    }   
}

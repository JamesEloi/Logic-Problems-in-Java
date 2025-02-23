package exercicios.maior;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite a numero:  ");
       int A = sc.nextInt();
        System.out.println("Write other number");
       int B = sc.nextInt();
       
       int maiorAB = (A + B + Math.abs(A - B))/2;
        System.out.println("O maior entre "+A+" e "+B+" é "+maiorAB);
    }
}

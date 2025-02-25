package exercicios.eixoxy;

import java.util.Scanner;

public class EixoXY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X1 = sc.nextDouble(); double Y1 = sc.nextDouble();
        double X2 = sc.nextDouble(); double Y2 = sc.nextDouble();
        
        double distance = (X2 - X1)*(X2 - X1) + (Y2 - Y1)*(Y2 - Y1);
        distance = Math.sqrt(distance);
        System.out.printf("%.4f\n", distance);
    }
}

package exercicios.total_fuel;

import java.util.Scanner;

public class Total_fuel {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      float Y = sc.nextFloat();
      float media = X/Y;
        System.out.printf("%.3f km/l\n", media);  
    }
}


package exercicios.baskara;

import java.util.Scanner;

public class Baskara {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();
        double discri = 0; 
        double root1 = 0;
        double root2 = 0;
        double absoluteValue = 0;
        double powerB = (double) Math.pow(b, 2);
        //discri is going to cauculate the discriminant at the Bhaskara's Formula 
        discri = powerB-4*a*c;
        //create a variable named square_root to keep up the square root of my discriminant
        double square_root = Math.sqrt(discri);
         
        
        
        if( b < 0) // b == (a negative number)
        {
           absoluteValue = Math.abs(b);
           root1 = (absoluteValue + square_root)/(2*a);
           root2 = (absoluteValue - square_root)/(2*a);
        }
            
        else
        {   
            // b == (a positive number)
            // and stay negative on the Baskara's Formula below
            root1 = (-b + square_root)/(2*a);
            root2 = (-b - square_root)/(2*a);
        }    
        
        if(discri <=0 || a ==0) // case math operation is impossible or divisor equal 0 at the Baskara's Formula
        {
            System.out.println("Impossible to calculate");
        }
        else
        {
          System.out.printf("R1 = %.5f%n",root1);
          System.out.printf("R2 = %.5f%n",root2);
        }    
      
        
    }
}

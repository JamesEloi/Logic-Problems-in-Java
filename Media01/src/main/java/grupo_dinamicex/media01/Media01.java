/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grupo_dinamicex.media01;

import java.util.Scanner;

public class Media01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System is going to read the values of the schoolar notes from the Brazil Country!!
        System.out.println("note 1: ");
        double A = sc.nextDouble();
        System.out.println("note 2: ");
        double B = sc.nextDouble();
        
        //Java is going to make a calculus called ponderate media and print the final result in the screen
        double mediaP = (A*3.5) + (B*7.5) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n",mediaP);
 
    }
}

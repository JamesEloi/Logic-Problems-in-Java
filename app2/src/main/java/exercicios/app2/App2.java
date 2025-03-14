/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.app2;

import java.util.Scanner;

/**
 *
 * @author Jhames
 */
public class App2 {
   
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in); 
       int days = reading.nextInt();
       int years = 0;
       int months = 0;
       int restDays = 0;
       int exitDays = 0;
       int plusPlus = 0;
      

       if(days > 30 && days < 360)
       {
           months = days/30;
           restDays = days%30;
          
       }
           
       else if (days >= 360)
        {
           
                      
                     
           months = days/30;
           restDays = days%30;
           years = (months/12);
           
           
        }
        
       if(months == 12)
       {
         months = 0;
       }
       
        for(int count = 365; count <= days; count +=365)
        {
          plusPlus += 360;
          System.out.println("" +count +" and "+plusPlus);
         
          if(days >= plusPlus && days <= count)
         {
            exitDays = count - plusPlus;
             System.out.println("exitDays = " + exitDays);
         }
        }
       
        
        
        int transformer = exitDays%30;
        
     
        restDays = exitDays%30;
        System.out.println(restDays +" dias");
        System.out.println(months+" meses");
        System.out.println(years + " years");
    }
}

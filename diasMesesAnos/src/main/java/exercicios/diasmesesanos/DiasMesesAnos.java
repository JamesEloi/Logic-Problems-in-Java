

package exercicios.diasmesesanos;

import java.util.Scanner;

public class DiasMesesAnos {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int days = reading.nextInt();
        int months = 0;
        int years = 0;
        int restDays = 0;
        int convertToMonth = 0;
        
        if (days < 30)
        {
               
        }
        else if(days >= 30 && days <=365)
        {
            months = days/30;
            restDays = days%30;
             if(months == 12)
             {
              years = months/12;   
              months = 0;
             }
            System.out.println(years+" ano(s)");
            System.out.println(months+" mes(es)");
            System.out.println(restDays+" dia(s)"); 
        }
        else if(days >= 365)
        {
          years = days/365;
          restDays = days%365;
          if(restDays >= 30)
          {
          convertToMonth = restDays/30;
          restDays = restDays%30;
          }
          
                  
          System.out.println(years+" anos(s)");
          System.out.println(convertToMonth+" mes(es)");
          System.out.println(restDays+" dia(s)");
        }
                
      
    }
}

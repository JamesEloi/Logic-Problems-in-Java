package exercicios.exactyearsdata;

import java.util.Scanner;

public class ExactYearsData {

    public static void main(String[] args) {
       Scanner reading = new Scanner(System.in); 
       int days = reading.nextInt();
       
       int months = days/30;
       int decimals_days = days%30;
       int years = days/365;
       int decimals_years = days%365;
       int set_days = days/months;
       int condition_rounds_months = years*12;
       
       
    if (days >= 30)
        {
           days = days - 30;
           months ++;
        }
    
       if(months > 12)
       {
           
           int right_numbers_months = months - (months - 11);
       }       
      
       
       if(decimals_years == 0 && years > 0)
       {           
           System.out.println(years+" Ano(s)");
           System.out.println(months+" Mes(es)");
           System.out.println(days+" Dia(s)");
       }
        
       if (decimals_years > 0 && years > 0)
       {
           days += decimals_years;
           System.out.println(years+" Ano(s)");
           System.out.println(months+" Mes(es)");
           System.out.println(days+" Dia(s)");
       } 
       
           
    }
}

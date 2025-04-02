
package exercicios.dataapp2;
import java.util.Scanner;
public class DataApp2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalDays = read.nextInt();
        int years = 0;
        int months = 0;
        int days = 0;
        int rest = 0;
        
        if (totalDays < 365)
        {
             months = totalDays/30;
             days = totalDays%30;
        }
        else if(totalDays >= 365)
        {
           years = totalDays/365;
           rest = totalDays%365;
           if(rest > 0 && rest <=30)
           {
             days = rest;
           }
           else if(rest >= 31)
           {
               
               months = rest/30;
               days = rest%30;
           }
        }
        
        System.out.println(years+" ano(s)");
        System.out.println(months+" mes(es)");
        System.out.println(days+" dia(s)");
    }
}

package exercicios.exactdata;

import java.util.Scanner;

public class ExactData {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int secondsToConvert = ler.nextInt();
        int minutes = 0;
        int hours = 0;
        int decimals = 0;
        int decimals_for_minutes = 0;
        
        if(secondsToConvert < 60)
        {
           decimals = secondsToConvert;
        }
        else if(secondsToConvert > 59)
        {
            minutes = secondsToConvert/60;
            decimals = secondsToConvert%60;
            
        }
        if(minutes > 59)
        {
           hours = minutes/60;
           decimals_for_minutes = minutes%60;
           minutes = 0;
           minutes += decimals_for_minutes;
        }
        System.out.println(hours+":"+minutes+":"+decimals);
    }
}

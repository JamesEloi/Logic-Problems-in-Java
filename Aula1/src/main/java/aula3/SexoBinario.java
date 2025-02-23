package aula3;
import java.util.Scanner;
public class SexoBinario {
      public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        char sexoBinario = sc.next().charAt(0);
        
        
        if(sexoBinario == 'f' || sexoBinario == 'm' || sexoBinario == 'F' || sexoBinario == 'M' ){
            System.out.println("SEXO BINARIO");
         }
        else
        {
            System.out.println("SEXO NÃO BINARIO");   
        }    
      }   
    }

    


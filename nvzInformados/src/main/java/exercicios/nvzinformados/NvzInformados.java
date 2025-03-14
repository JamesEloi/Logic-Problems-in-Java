
package exercicios.nvzinformados;

import java.util.Scanner;

public class NvzInformados {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("digite um valor");
        int num = 0;
        int conta_qt_num = 0;
        int conta_qt_cinco = 0;
        while(num != -1)
        {
           num = read.nextInt();
           if(num == 5)
           {
             conta_qt_cinco +=1;
           }
           
          if( num != -1)
          {
               conta_qt_num += 1;
               System.out.println("(digite outro valor) ou -1(fechar o programa)");
          }
          
                        
        }
        System.out.println("apareceu o total de "+conta_qt_num+" numeros");
        System.out.println("O numero 5 apareceu "+conta_qt_cinco+" vezes");
    }
}

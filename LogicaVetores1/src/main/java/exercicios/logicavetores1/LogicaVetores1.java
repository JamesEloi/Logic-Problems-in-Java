package exercicios.logicavetores1;
import java.util.Scanner;
public class LogicaVetores1 {

    public static void main(String[] args) 
    {
       Scanner read = new Scanner(System.in);
       double idade[] = new double [5];
       int n = 5;
       double media = 0;
       int box_for = 1;
       for(int i = 0; i < n; i++)
       {
           System.out.println("Digite a " + box_for + " Idade ");
           idade[i] = read.nextDouble();
          media = media + idade[i];
          box_for += 1;
       }
       box_for = 1; 
       
        System.out.println("As idades são:");
        for(int i = 0; i < n; i++)
       {
           System.out.println(box_for + " Idade = " + idade[i]);
           media = media + idade[i];
           box_for += 1;
       }
        media = media/n;
        System.out.printf("e a madia das 5 idades e: %.2f", media);
        
    }
}

package exercicios.maioreposicao;
import java.util.Scanner;
public class MAIORePOSICAO {

    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        int box = 0;
        int poPlacar = 0;
        int numPlacar = 0;
        for(int i = 0; i < 100; i++)
        {
          int valores = read.nextInt();
          numPlacar += 1;
          if(valores > box)
          {
            box = valores;
            poPlacar = numPlacar;
          } 
        }
        System.out.println(box);
        System.out.println(poPlacar);
    }
}

package exercicios.vetoresexemplos;
import java.util.Scanner;
public class VetoresExemplos {
    public static void main(String[] args) {
        
        
        //inserção direta
        int vetorLost[] = {4,8,15,16,23,42};
        String nome[] = {"Juca", "Teco", "Pepe"};
        
        for(int i = 0; i < 6; i++)
        {
            System.out.println("Vetor["+i+"] = " + vetorLost[i]);
        }
        System.out.println("\n");
        System.out.println("Outros Exemplos");
        System.out.println("Exemplo 2 \n\n");
        
        //inserção direta de outro vetor…
        int num[] = {15,23,40,12,37};
        int vetor1[] = new int[10]; // alocar espaço para o vetor
        
       for(int i = 0; i < 5; i++)
       {
         vetor1[i]=num[i];
           System.out.println("Vetor1["+i+"] = " + vetor1[i]);
       }
       
       System.out.println("\n");
        System.out.println("Exemplo 3 \n\n");
        
        int i, n = 10; // índice ou posição
        
        for(i = 0; i < n; i++)
        {
          vetor1[i] = i;
            System.out.println("Vetor [" + i +"] = "+vetor1[i]);
        }
        
      
        
        
        System.out.println("\n");
        System.out.println("Exemplo 4 \n\n");
        
        //entrada de dados em vetor com Scanner
        Scanner reading = new Scanner(System.in);
        for(i = 0; i < n; i++)
        {
          vetor1[i] = i;
            System.out.printf("Informe o %d  valor de %d: ", (i+1), n);
            vetor1[i] = reading.nextInt();
        }
        System.out.println("O vetor completo:");
        for(i = 0; i < n; i++)
        {
          System.out.println("Vetor[" + i + "] = " + vetor1[i]);
        }
        
        
    }
}

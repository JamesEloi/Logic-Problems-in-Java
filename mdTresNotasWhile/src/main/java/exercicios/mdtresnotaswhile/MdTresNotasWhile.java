package exercicios.mdtresnotaswhile;

import java.util.Scanner;

public class MdTresNotasWhile {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float media = 0;
        float soma = 0;
        float nota = 0;
        int cont = 0;
        int id_aluno = 1;
        while(nota >= 0)
        {
        nota = read.nextFloat();
        soma += nota;
        cont++;
           if(cont == 3)
           {
             media = soma/cont;
               System.out.printf("Aluno %d / Media: %.1f%n", id_aluno, media);
               System.out.printf("Soma das Notas: %.1f%n",soma);
              cont = 0; 
              soma = 0;
               System.out.println("Para fechar o programa! ");
               System.out.println("Digite um  .  .  .      ------------>/-/  numero negativo");
               System.out.println("________________________");
               id_aluno++;
               System.out.println("ou digite notas do aluno"+ id_aluno);
               System.out.println("_________________________");
               
           }
          if(nota < 0)
          {
              System.out.println("      __________________________________________________________");
              System.out.println("      S E U -- P R O G R A M A --  F O I -- F I N A L I Z A D O");
              System.out.println("        C O M  -- S U C E S S O  ! ! !");
              System.out.println("      ___________________________________________________________");
          }
        }
        
        
        
        
    }
}

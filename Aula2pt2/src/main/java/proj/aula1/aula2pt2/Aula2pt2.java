

package proj.aula1.aula2pt2;


public class Aula2pt2 {

    public static void main(String[] args) {
       int A = 2;
       A ++;
       A = A + 1;
       A--;
       A = A - 1;

        System.out.println("O valor sera: " + A);
        
     A = 0;
     A = 1;
     A += 20;
     A++;
        System.out.println("O valor de A agora sera: " + A);
        
      int B;
      A = 2 + 1;
      B = 4/2;
      A++;
      B += 2;  
      if (A == B){
          System.out.println("Os valores de A e B são iguais!");
      }
      else{
          System.out.println("Os valores de A e B são diferentes!");
      } 
      
        System.out.println("Os valores de A e B são: " + A + " e " + B);
    }
}

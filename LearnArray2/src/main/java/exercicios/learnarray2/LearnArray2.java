package exercicios.learnarray2;
public class LearnArray2 {

    public static void main(String[] args) {
        int soma = 0;
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        String tot[] ={"31","28","31","30","31","30","31","31","30","31","30","31","30","31"};
        
           for(int c = 0; c < mes.length; c++)
           {
           System.out.println("Mes de "+mes[c]+ " tem "+tot[c]+" Dias no total");
           int conversor = Integer.parseInt(tot[c]);
           soma += conversor;
           
           
           }
               
           if (soma > 365)
           {
               System.out.println("O ano que tem "+soma+" é Bisexto");
           }
           else
           {
               System.out.println("O ano que tem "+soma+" não é Bisexto");           
           }
    }
}

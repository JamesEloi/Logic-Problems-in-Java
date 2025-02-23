package Exercicios.funcionarios;
import java.util.Scanner;

public class Funcionarios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int horas = sc.nextInt();
        float salary = sc.nextFloat();
        
        float total_salary = horas*salary;
        
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n", total_salary);
    }
}

package exercicios.interest.rate;
import java.util.Scanner;
public class InterestRate {

    public static void main(String[] args) {
       Scanner sc1 = new Scanner(System.in);
       Scanner sc2 = new Scanner(System.in);
       
       // Ask to usser enter with name and sales value and Salary
        System.out.print("Write your name: ");
        String nome = sc2.nextLine();       
       
       System.out.print("write your salary: ");
       double fixedSalary = sc1.nextDouble();
       
       System.out.print("write the sales you make: ");
       double sales = sc1.nextDouble();
       
       //here the count to sum the commission
       double commission = sales*0.15;
       double totalSalary = fixedSalary + commission;
       
        System.out.println("Sr "+nome);
        System.out.printf("your initial salary was U$ %.2f\n", fixedSalary);
        System.out.printf("and now your acctual salary is U$ %.2f\n", totalSalary);
    }
}

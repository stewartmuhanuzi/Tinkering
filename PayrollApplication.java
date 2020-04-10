import java.util.Scanner;

public class PayrollApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user to enter details
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        //calculate the payments 
        double grossPay = hours * payRate;
        double federal = (0.2 * grossPay);
        double state = (0.09 * grossPay);
        double totalDeductions = sum(federal, state);
        double netPay = (grossPay - totalDeductions);
        
        System.out.printf();







    
    }
}
   
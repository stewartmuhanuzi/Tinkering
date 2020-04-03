import java.util.Scanner;

/**
 * ComputeLoan
 */
public class ComputeLoan {

    public static void main(String[] args) {
        //Declare the scanner object
        Scanner input = new Scanner(System.in);

        //Declare Annual interest
        System.out.print("Please Enter the Annual Interest rate e.g 5.2%: ");
        double annualInterestRate = input.nextDouble();
        
        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        //Declare number of years 
        System.out.print("Enter the number of years e.g 5: ");
        double numberOfYears = input.nextDouble();

        //Declare the loan amount
        System.out.print("Enter the Loan Amount, e.g 200000: ");
        double loanAmount = input.nextDouble();

        //calculate monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        //calculate the total payment
        double totalPayment = monthlyPayment * numberOfYears *12;

        //display the input 
        System.out.println("You have taken a loan amount of UGX: " + loanAmount + " for a period of: " + numberOfYears + " with an annual interest of: " + annualInterestRate);

        //display results or payment plan
        System.out.println("**********************************************************");
        System.out.println("Your payment plan is as follows");
        System.out.println("**********************************************************");
        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100)/100.0);
        System.out.println("The total payment is " + (int)(totalPayment * 100)/100.0);

        


    }
}
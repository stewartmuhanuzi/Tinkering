import java.util.Scanner;

/**
 * Exponential
 */
public class Exponential {

    public static void main(String[] args) {
        
        //Create the Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt User to enter values
        System.out.println("Please enter the base value");
        int a = input.nextInt();

        System.out.println("Please enter the power value");
        int b = input.nextInt();

        System.out.println("The Answer is: " + Math.pow(a,b));

    }
}
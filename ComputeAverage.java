import java.util.Scanner;

/**
 * ComputeAverage
 */
public class ComputeAverage {

    public static void main(final String[] args) {
        // Create A Scanner object
        final Scanner input = new Scanner(System.in);

        // Prompt User Input
        System.out.print("Enter the numbers");
        final double num1 = input.nextDouble();
        final double num2 = input.nextDouble();
        final double num3 = input.nextDouble();

        // Compute average
        final double average = (num1 + num2 + num3) / 3;

        //Display results
        System.out.println("The Average of " + num1 + "," + num2 + " and " + num3 + " is: " + average);
    }
}
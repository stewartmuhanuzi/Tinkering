import java.util.Scanner;

/**
 * SalesTax
 */
public class SalesTax {

    public static void main(String[] args) {
        final double rate = 0.06;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Purchase Price: ");
        double purchaseAmount = input.nextDouble();

        int tax = purchaseAmount * rate;
        System.out.println("Sales Tax is: " + tax);
    }
}
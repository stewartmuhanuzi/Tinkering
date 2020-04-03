import java.util.Scanner;

/**
 * FirstPrinciples
 */
public class FirstPrinciples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the values for a: ");
        double a = input.nextDouble();

        System.out.println("please enter the values for b: ");
        double b = input.nextDouble();

        System.out.println("please enter the values for c: ");
        double c = input.nextDouble();

        double result = (- b + Math.sqrt(b*b - 4 * a *c)) / 2 * a;
        
        System.out.println("The result for the arithmetic expression is: " + result);



    }
}

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble(); //declare radius as a double
        double area = radius * radius * 3.14;
        System.out.println("The Area of a circle of radius " + radius + " is " + area);


    }
}
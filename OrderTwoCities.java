import java.util.Sacnner;
import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user to enter the names of cities
        System.out.print("Enter the First City: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second City: ");
        String city2 = input.nextLine();

        if(city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are: " + city1 + " " + city2);

        else 
            System.out.println("The cities in alphabetical order are: " + city2 + " " + city1);    


    }

}
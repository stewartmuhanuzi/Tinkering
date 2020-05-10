import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {

    //Create Scanner object
    Scanner input = new Scanner(System.in);

    //String array
    String[] food = {"Posho","Rice","Irish","Matooke", "Supageti"};
    String[] sauce = {"Beans","Beef","Peas","Fish","Eggs","G-Nuts"};
    System.out.print("Give your number of Test Cases: ");

    //Get User input
    int numberOfTest = input.nextInt();
    for(int i = 0; i < numberOfTest; i++){
        int index = (int)(Math.random() * 10);
        System.out.println(food[index] + " and " + sauce[index]);
    }

        
    }
    


}
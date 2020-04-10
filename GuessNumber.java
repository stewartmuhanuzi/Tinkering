import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the magic number between 0 and 100: ");
        //int guess = input.nextInt();

        int guess = -1;

        while(guess != number){
            //Prompt user to enter the guess number
            System.out.print("\nEnter the guess number ");
            guess = input.nextInt();

            if(guess == number){
                System.out.println("Yes you got it");
            }
            else if(guess < number){
                System.out.println("The number is too low");    
            }
            else{
                System.out.println("The number is too high");
            }

        }

    }

}
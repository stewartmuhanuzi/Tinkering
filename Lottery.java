import java.util.Scanner;

/**
 * Lottery
 */
public class Lottery {

    public static void main(String[] args) {
        //Generate a random lottery digits
        int lottery = (int)(Math.random() * 100);
        //System.out.println(lottery);

        // String luckyNum = String.valueOf(lottery);
        // for(int i = 0; i < luckyNum.length(); i++) {
        //     int j = Character.digit(luckyNum.charAt(i), 10);
        //     System.out.println("Digit " + i + ":" + j);
        //     }




        //Require user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your lucky two numbers e.g 12: ");
        int guess = input.nextInt();
        /*
        Consider an a random value generated like 45, we split it as the lucky number
        by dividing it by 10 for the first digit and get its remainder in terms of 10 for the second digit
        */
        //Get digits from Lottery
        int lotteryDigit1 = lottery / 10; 
        int lotteryDigit2 = lottery % 10;
        //System.out.println(lotteryDigit1 + " And " + lotteryDigit2);

        //Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        //Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        
        else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");

        else if(guessDigit1 == lotteryDigit1 
            || guessDigit1 == lotteryDigit2 
            || guessDigit2 == lotteryDigit1 
            || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");

        else
            System.out.println("Please try again !!!");
        
    }
}

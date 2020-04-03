import java.util.Scanner;

/**
 * AdditionQuiz
 */
public class AdditionQuiz {

    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        //int answer = number1 + number2;

        //Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("What is " +number1+ " + " +number2+ "? ");
        String modifier = ("The Answer is:");

        int number = input.nextInt();
        if (number == number1 + number2){
            System.out.print(modifier + true);
        }
        else{
            System.out.print(modifier + false);
        } 

        //System.out.println( number1 + " + " +s number2 + " = " +answer+ " is " + (number1 + number2 == answer));
    }
}
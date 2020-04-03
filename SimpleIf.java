import java.util.Scanner;

//import org.xml.sax.ErrorHandler;

/**
 * SimpleIf
 */
public class SimpleIf {

    public static void main(String[] args) {
        //Scanner object declaration
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an Integer:");
        int number = input.nextInt();
     

        if (number % 5 == 0){
            System.out.print("A mutiple of 5");
        }
        if (number % 2== 0){
            System.out.print(" HiEven");
        }
        else{
            System.out.print("Wrong Entry!!!!!!!");
        }


    }
}
import java.util.Scanner;
public class TestConditionals {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();
            System.out.println((x < y && y < z) ? "sorted" : "not sorted");
            }
        
}
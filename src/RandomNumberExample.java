
import java.util.Scanner;

public class RandomNumberExample {

    public static void main(String[] args) {

        while (true) {
            int value = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter number between 1 to 10");
            int a = s.nextInt();
                value = (int) ((Math.random()*10)+1);
                System.out.println("random value is :"+value);
           

            if (value == a) {
                System.out.println("Correct guess");
                break;
            } else if (value < a) {
                System.out.println("your value is greater, random value is :"+value);
            } else if (value > a) {
                System.out.println("your value is lesser, random value is :"+value);
            }
        }
    }

}

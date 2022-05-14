package Section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum=0;
        int count=1;
        Scanner sd=new Scanner(System.in);
        while(count<=10)
        {
          System.out.println("enter number"+count);
          boolean hasnext=sd.hasNextInt();
          if(hasnext)
        {
          int number1=sd.nextInt();
          sum+=number1;
          count++;
        }
        else
        {
        System.out.println("Accept Integers only");
        }
          sd.nextLine();
        }
        System.out.println("sum of integers is: "+sum);
    }
 
}

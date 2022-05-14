package Section5;
import java.util.*;
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Scanner sd=new Scanner(System.in);
        while(true){
        System.out.println("Enter number: ");
        boolean istrue=sd.hasNextInt();
        if(istrue)
        {
            int number=sd.nextInt();
            if(number>max)
            {
                max=number;
            }else if(number<min){
                min=number;
            }   
        }
        else{
                break;
            } 
        sd.nextLine();
        }
        System.out.println("Maximum value is:"+ max+"\n Minimum"+min);
        
    }
}

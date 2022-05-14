
package Section5;

public class WhileLoopExample1 {
    public static void main(String[] args) {
        int number=0;
        while(number<=15)
        {
            number++;
            if(number<=5)
            {
                System.out.println("number: "+number);
                continue;
            }
            System.out.println("number outside if condition: "+ number);
            if(number>=10)
            {
                System.out.println("number greater than or equal to 10: ");
                break;
            }
                    
        }
    }
}

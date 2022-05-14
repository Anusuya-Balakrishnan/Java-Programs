package Section5;
public class DigitSumChallenge {
    public static int sumDigits(int number)
    {
        int sum=0;
        if(number<0 || number<=10)
        {
            return -1;
        }
        else if(number>0){
            while(number>0)
            {
            int modnumber=number%10;
            sum+=modnumber;
            number=number/10;
            } 
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(12895));
    }
}

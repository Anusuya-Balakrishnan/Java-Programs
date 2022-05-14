package Section5;
public class PrimeNumberCheck {
   public static void isPrime(int number)
   {
       int count=0;
       if(number<=1)
       {
           System.out.println("Not Prime Number");       
       }
       else{
           for(int i=2;i<number;i++)
           {
               if(number%i==0){
                   count++;
               }
           }
           if(count>=1)
       {
         System.out.println("Not Prime Number");  
       }
       else{
           System.out.println("Prime Number");
       }
       }
       
   }
    public static void main(String[] args) {
        isPrime(5);
        isPrime(-1);
        isPrime(10);
    }
}

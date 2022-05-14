package Section5;
public class ForLoopExample {
    public static void main(String[] args) {
        int sum=0,count=0;
     for(int i=1;i<=1000;i++)
  {
     if(i%3==0 && i%5==0)
     {
         sum+=i;
         count++;
         System.out.println(i+" is divible by 3 and 5");
     }
     if(count==5)
     {
         break;
     }
  }   
     System.out.println("Sum of all the numbers which is divible by 3 and 5 :"+sum
     );
    }  
}

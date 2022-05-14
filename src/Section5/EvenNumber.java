
package Section5;

public class EvenNumber {
   public static boolean isEvenNumber(int number)
   {
       if(number%2==0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
    public static void main(String[] args) {
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(100));
        System.out.println(isEvenNumber(55));
        System.out.println(isEvenNumber(59));
        System.out.println(isEvenNumber(35));
        
    }
}

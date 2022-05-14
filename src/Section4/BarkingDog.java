
package Section4;

public class BarkingDog {
     public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
    if((barking==true))
    {
      if( (hourOfDay >=0 && hourOfDay < 8) || (hourOfDay >22 && hourOfDay<24))
       {
         return true;
       }         
    else if(hourOfDay < 0 || hourOfDay > 23)
    {
        return false;
    }
    else
    {
        return false;
    }
    }
    return false;
}
    public static void main(String[] args)
    {
        System.out.println(shouldWakeUp(true,0));
    }
}

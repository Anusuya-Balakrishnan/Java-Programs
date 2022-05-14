
package Section4;
public class CalculatorFeetAndInches {
    public static double calcuFeetAndInchesToCentimeters(double feet,double inches)
    {
        if((feet>=0)&&(inches>=0 && inches<=12))
        {
            double centimeters =((feet*12)+inches)* 2.54d;
            System.out.println(feet +"feets + "+inches+" inches = "+centimeters);
            return centimeters;
        }
        return -1;
    }
    public static double calcuFeetAndInchesToCentimeters(double inches)
    {
        if((inches>=0 || inches<=12))
        {
            double centimeters =inches * 2.54d;
            System.out.println(inches+" inches = "+centimeters);
            return centimeters;
        }
        return -1;
    }
    public static double calcuFeetAndInchesToCentimeters()
    {
        
        System.out.println("feet and inches values are equal to zero");
        return 0;
    }
    public static void main(String[] args){
      calcuFeetAndInchesToCentimeters(7,5);
      calcuFeetAndInchesToCentimeters(6);
      calcuFeetAndInchesToCentimeters();
    }
}

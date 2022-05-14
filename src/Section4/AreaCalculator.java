package Section4;
public class AreaCalculator {
    
    public static double area(double radius)
    {
        if(radius<0)
        {
            return -1;
        }
        double Pi=Math.PI;
        return radius*radius*Pi;
    }
    public static double area(double nums,double nums1)
    {
        if(nums<0 || nums1<0){
            return -1;
        }
        return(nums*nums1);
    }
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }
}

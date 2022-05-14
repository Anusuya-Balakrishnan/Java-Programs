package Section4;
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double nums1,double nums2)
    {
        nums1=(int)(nums1*1000);
        nums2=(int)(nums2*1000);
        if(nums1==nums2)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756d,-3.175d));
       
    }
}

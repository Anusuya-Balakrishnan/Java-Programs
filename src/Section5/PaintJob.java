package Section5;
public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets)
    {
        double value;
        if(width<=0 || height <=0 ||areaPerBucket<=0 || extraBuckets<0)
        {
            return -1;
        }
        else
        {
            value=Math.ceil(((width*height)/areaPerBucket)-extraBuckets);
            return (int)value;
        }
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if(width<=0 || height <=0 ||areaPerBucket<=0 )
        {
            return -1;
        }
        else
        {
            double noOfBuckts= Math.ceil((width*height)/areaPerBucket);
           return(int)(noOfBuckts);
        }
    }
    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area<=0 || areaPerBucket<=0)
        {
            return -1;
        }
        else{
            double noOfBuckts= Math.ceil(area/areaPerBucket);
           return(int)(noOfBuckts);
        }
    }
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        //System.out.println(getBucketCount(-3.4,2.1,1.5));
        //System.out.println(getBucketCount(3.4,2.1,1.5));
        //System.out.println(getBucketCount(7.25,4.3,2.35));
        //System.out.println(getBucketCount(3.4,1.5));
        //System.out.println(getBucketCount(6.26,2.2));
        //System.out.println(getBucketCount(3.26,0.75));
        
    }
}

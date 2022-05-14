package Section8;

import java.util.Arrays;

public class ReverseArray {
  private static void reverse(int[] array)
  {
      int [] reverse=new int[array.length];
      int j=0;
      for(int i=array.length-1;i>=0;i--)
      {
         reverse[j]=array[i];
         j++;
      }
      System.out.println("Array = "+ Arrays.toString(array));
      System.out.println("Reversed array = "+ Arrays.toString(reverse));
  }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        reverse(array);
    }
}

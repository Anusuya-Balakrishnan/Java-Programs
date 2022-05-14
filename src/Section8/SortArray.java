package Section8;

import java.util.Scanner;

public class SortArray {
    public static Scanner scanner=new Scanner(System.in);
    public static int[] getIntegers(int number){
        int [] array=new int[number];
        System.out.println("Enter "+number +" number");
        for(int i=0;i<number;i++)
        {
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static int[] sortIntegers(int[] array)
    {
        int []sortArray = array;
        for(int i=0;i<array.length-1;i++)
        {
         for(int j=0;j<array.length-1;j++)
         {
           if(sortArray[j]<sortArray[j+1])
          {
              int temp=sortArray[j];
              sortArray[j]=sortArray[j+1];
              sortArray[j+1]=temp;
          }
         }   
        } 
        return sortArray;
    }
    public static void printArray(int[] sortArray)
    {
        for(int i=0;i<sortArray.length;i++)
        {
          System.out.println("Element "+i+" contents "+sortArray[i]);  
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter length of array :");
       int length=scanner.nextInt();
       int [] array=getIntegers(length);
       int [] sortArray=sortIntegers(array);
       printArray(sortArray);
       
    }
}

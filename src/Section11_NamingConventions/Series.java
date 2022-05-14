/*
 // Create a suitably named package containing a class called Series
        // with the following static methods:
        // nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
        // 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
        //
        // factorial(int n) returns the product of all numbers from 1 to n
        //      i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
        // The first 10 factorials are:
        // 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
        //
        // fibonacci(n) returns the nth Fibonacci number. These are defined as:
        // f(0) = 0
        // f(1) = 1
        // f(n) = f(n-1) + f(n-2)
        // (so f(2) is also 1. The first 10 fibonacci numbers are:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
        //
        // When you have tested your functions, delete the Main class and
        // produce a jar file.
        //
        // Create a new project and add your Series library, then test the
        // three methods in the main() method of your new project.

22.1.2022
 */
package Section11_NamingConventions;

public class Series {
    public static long nSum(int n)
    {
        return (n*(n+1))/2;
    }
    public static long factorial(int n)
    {
        if(n==0){
            return 1;
        }
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static long fibonacci(int n)
    {
        int c=0;
        if(n==0)
        {
            return 0;
        }
        while(c<=n)
        {
        int a=0;
        int b=1;
        c=a+b;
        a=b;
        b=c;   
        }
      return c;  
    }
}

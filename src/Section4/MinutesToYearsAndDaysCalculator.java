package Section4;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else{
         long hour = (long)(minutes/60);
        long day =hour/24;
        long year=day/365;
        if(day>=365)
        {
            day=day%365;
            year+=day/365; 
        }
        System.out.println(minutes+" min = "+year+" y and "+ day+" d");   
        } 
    }
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    }


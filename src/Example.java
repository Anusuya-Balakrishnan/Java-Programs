/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 1
 */
import java.util.*;

public class Example {

    int a;
    public Example(){
        this.a=0;
    }
    public static void main(String[] args) {
//        int a = 'b' + 6;
//        System.out.println(a);
//        String c = "C";
//        String d = "A";
//        int value = c.compareTo(d);
//        System.out.println(c + ".compareTo " + d + " " + value);
//        c = "ap";
//        d = "ant";
//        value = c.compareTo(d);
//        System.out.println(c + ".compareTo " + d + " " + value);
//        ArrayList<Integer> arraylist = new ArrayList<>();
//        arraylist.add(1);
//        arraylist.add(2);
//        arraylist.add(3);
//        arraylist.add(4);
//        arraylist.add(5);
//        arraylist.add(6);
//        arraylist.add(7);
//        arraylist.add(18);
//        arraylist.add(9);
//        arraylist.add(12);
//        System.out.println(arraylist);
//        ArrayList<Integer> arraylistCopy=new ArrayList<>(arraylist);
//        System.out.println("Copy ArrayList"+ arraylistCopy);
//Example ex=new Example();
//Example ex1=new Example();
//ex.display(ex);
//ex.display(ex1);      
//    }
//    public void display(Object obj){
//        if(this==obj)
//        {
//            System.out.println("Equal");
//            System.out.println(this);
//            System.out.println(obj);
//            System.out.println(this.getClass().getName());
//    System.out.println(obj.getClass().getName());
//        }
//        else{
//           System.out.println("not Equal"); 
//           System.out.println(this);
//            System.out.println(obj);
//        }
       sortInteger(12); 
    }
    public static void sortInteger(int testValue){
        ArrayList<Integer> arraylist=new ArrayList<>();
        arraylist.add(23);
        arraylist.add(56);
        arraylist.add(45);
        arraylist.add(12);
        arraylist.add(78);
        arraylist.add(89);
        Collections.sort(arraylist);
        int value=Collections.binarySearch(arraylist, testValue);
        if(value>=0){
            System.out.println(" Index Value of number "+arraylist.get(value)+" in this list "+value);
        }
        else
        {
         System.out.println(" number not present in this list "+value);   
        }
        
    }
}

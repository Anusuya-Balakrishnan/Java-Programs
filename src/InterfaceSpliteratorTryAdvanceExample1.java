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
public class InterfaceSpliteratorTryAdvanceExample1 {
  public static void main(String args[]){  
         List<String> list = Arrays.asList("Jasmine", "Rose", "Lotus","aaa","bbb");  
         Spliterator<String> splitr = list.spliterator();  
       //Use tryAdvance() to display(action) elements of list.  
         boolean b1 = splitr.tryAdvance(System.out::println);  
         System.out.println("Element exists: "+b1);  
         System.out.println(" --- bulk traversal");  
         splitr.forEachRemaining(System.out::println);  
         System.out.println(" --Attempting tryAdvance again--");  
         boolean b2 = splitr.tryAdvance(System.out::println);  
         System.out.println("Element exists: "+b2); 
         System.out.println(list);
       }    
}

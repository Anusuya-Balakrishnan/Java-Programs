/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 1
 */
public class StaticBlock {
    
    StaticBlock(){
        System.out.println("constructor is running");
    }
   static {
       System.out.println("Static block is running");
   }
   {
       int a=10;
       System.out.println("block is running"+a);
   }
    public static void main(String[] args) {
       StaticBlock ao=new StaticBlock(); 
    }
}

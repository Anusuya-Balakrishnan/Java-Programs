/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author DELL 1
 */
public class ThrowKeyword {
    public void even(int a) throws ArithmeticException {
        if(a%2!=0){
            throw new ArithmeticException("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }
    public static void main(String[] args) {
        
        ThrowKeyword ne=new ThrowKeyword();
        try{
          ne.even(4); 
          ne.even(7); 
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}

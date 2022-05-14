/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.CarpetCostCalculator;

public class Floor {
  public double width;
  public double length;
   public Floor(double width, double length)
   {
       if(width<0)
       {
           this.width=0;
       }
       else
       {
           this.width=width;
       }
       if(length<0)
       {
           this.length=0;
       }
       else
       {
           this.length=length;
       }
   }
       public double getArea()
       {
           return this.length*this.width;
       }
     
}

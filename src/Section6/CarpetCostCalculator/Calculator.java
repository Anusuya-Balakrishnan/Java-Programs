/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.CarpetCostCalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;
    
    public Calculator(Floor floor,Carpet carpet)
    {
        this.carpet=carpet;
        this.floor=floor;
    }
    public double getTotalCost()
    {
        return (double)(floor.getArea()*carpet.getCost());
    }
    
    public static void main(String[] args) {
        
        
      Carpet carpet1=new Carpet(3.5);
      Floor floor=new Floor(2.75,4.0);
      Calculator cal=new Calculator(floor,carpet1);
        System.out.println("total="+cal.getTotalCost());
        carpet1=new Carpet(1.5);
        floor =new Floor(5.4,4.5);
        cal=new Calculator(floor,carpet1);
        System.out.println("total="+cal.getTotalCost());
      
      
      
      
      
    }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section3;

/**
 *
 * @author DELL 1
 */
public class TernaryOperatorsExample {
     public static void main(String[] args) {
      double myFirstNumber=20.00d;
            double mySecondNumber=80.00d;
            double myThirdNumber=(myFirstNumber+mySecondNumber)*100.00d;
            int remainder1 =(int)(myThirdNumber%40.00d);
            boolean boolean1=(remainder1==0)?true:false;
                System.out.println(boolean1);
    }
}

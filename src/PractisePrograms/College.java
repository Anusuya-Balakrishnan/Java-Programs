/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractisePrograms;

/**
 *
 * @author DELL 1
 */
public class College {
    int mark;
    public College(int mark){
        this.mark=mark;
    }
    public void scholarship(){
        if(mark>=480){
            System.out.println("10% discount");
        }
        else{
            System.out.println("no discount");
        }
    }
}

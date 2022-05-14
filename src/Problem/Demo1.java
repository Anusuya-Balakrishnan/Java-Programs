/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem;

/**
 *
 * @author DELL 1
 */
public class Demo1 {
    public String name="john";
    public Demo1(){
        System.out.println("Default Constructor");
    }
    public Demo1(String name){
        super();
        this.name=name;
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        Demo1 d=new Demo1("Jacob");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.BillBurgerTim;

class DeluxeBurger extends Hamburger
{
    public DeluxeBurger()
    {
        super("Deluxe","Sausage & Bacon",14.54,"White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition1("Drink",1.81);   
    }
    @Override
    public void addHamburgerAddition1(String name,double price){
        System.out.println("Can not add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String name,double price){
    System.out.println("Can not add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String name,double price){
    System.out.println("Can not add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition4(String name,double price){
    System.out.println("Can not add additional items to a deluxe burger");
    }
    @Override
    public double itemizeHamburger()
    {
      return super.itemizeHamburger();
    }
}
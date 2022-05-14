
package Section6.BillBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("Basic", "Sausage",3.56,"white");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is "+ hamburger.itemizehamburger());
        System.out.println("***********");
        HealthyBurger healthyburger=new HealthyBurger("Bacon",5.67);
        healthyburger.addHamburgerAddition1("Egg",5.43);
        healthyburger.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is "+ healthyburger.itemizehamburger());
        System.out.println("***********");
        DeluxeBurger deluxeburger=new DeluxeBurger();
        deluxeburger.addHamburgerAddition3("Should not do this", 0);
        System.out.println("Total Deluxe Burger price is "+deluxeburger.itemizehamburger());
        
        
        
    }
}

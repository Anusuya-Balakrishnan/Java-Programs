
package Section6.Car;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Base Car",2);
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        Ford car1=new Ford("Ford Falcon",2);
        System.out.println(car1.getName());
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());
        Mitsubishi mitsubishi=new Mitsubishi("Outlander VRX 4WD",6);
        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        Holden holden =new Holden("Holden Commodore",6);
        System.out.println(holden.getName());
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}

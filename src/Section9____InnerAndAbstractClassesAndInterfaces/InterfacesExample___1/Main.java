package Section9____InnerAndAbstractClassesAndInterfaces.InterfacesExample___1;

public class Main {

    public static void main(String[] args) {
        Itelephone telephone = new DeskPhone(123645);
        telephone.powerOn();
        telephone.callPhone(123645);
        telephone.answer();
        telephone.dial(578963);
        System.out.println("__________________________");
        telephone = new MobilePhone(987456);
        telephone.powerOn();
        telephone.callPhone(987456);
        telephone.dial(987456);
    }

}

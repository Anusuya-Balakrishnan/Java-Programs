
package Section11_NamingConventions.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        StaticTest firstInstance=new StaticTest("First Instance");
        System.out.println(firstInstance.getName()+" is instance number "+ firstInstance.getNumInstance());
        StaticTest secondInstance= new StaticTest("Second Instance");
        System.out.println(secondInstance.getName()+" is instance number "+secondInstance.getNumInstance());
        StaticTest thirdInstance=new StaticTest("Third Instance");
        System.out.println(thirdInstance.getName()+" is instance number "+thirdInstance.getNumInstance());
    }
  
}

/*
 25.1.2022
 */
package Section11_NamingConventions.FinalKeyword;
public class MainPassword {
    public static void main(String[] args) {
        Password pass=new Password(125436653);
        pass.storePassword();
        pass.letMeIn(122121);
        pass.letMeIn(-456984);
        pass.letMeIn(125436653);
    }
 
}

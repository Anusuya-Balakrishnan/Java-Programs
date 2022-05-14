
package Section11_NamingConventions;

public class ScopeCheckMain {
    public static void main(String[] args) {
        ScopeCheck scopecheck=new ScopeCheck();
        System.out.println("publicVar is: "+scopecheck.publicVar);
        System.out.println("PrivateVar is: "+scopecheck.getPrivateVar());
        scopecheck.timesTwo();
        ScopeCheck.InnerClass innerClass=scopecheck.new InnerClass();
        innerClass.timesTwo();
        
    }
}

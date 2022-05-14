package Section11_NamingConventions;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar= " + this.publicVar + " ,privateVar= " + this.privateVar);
    }

    public int getPrivateVar() {
        return this.privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(privateVar + " *" + i + " =" + privateVar * i);
        }
    }

    public class InnerClass {

        private int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass is created, privateVar is :" + privateVar);
        }

        public void timesTwo() {
            ScopeCheck.this.timesTwo();
            //int privateVar = 4;
            System.out.println("************************************");
            for (int i = 1; i <= 10; i++) {
                System.out.println(privateVar + " *" + i + " =" + privateVar * i);
            }
        }
    }
}

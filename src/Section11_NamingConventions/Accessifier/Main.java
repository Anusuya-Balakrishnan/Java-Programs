
package Section11_NamingConventions.Accessifier;

public class Main {
    public static void main(String[] args) {
        Account account=new Account("Anusuya");
        account.deposit(11000);
        account.withdraw(1500);
        account.calculateBalance();
        System.out.println("The available balance is: "+account.getBalance());
    }
}

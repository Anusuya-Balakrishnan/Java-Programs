
package Section11_NamingConventions.Accessifier;
import java.util.*;
public class Account {
    private String accountName;
    private int balance;
    private ArrayList<Integer> transactions;
    public Account(String accountName)
    {
        this.accountName=accountName;
        this.transactions=new ArrayList<Integer>();
    }
    public int getBalance()
    {
        return this.balance;
    }
    public void deposit(int amount)
    {
        if(amount>0)
        {
            transactions.add(amount);
            this.balance+=amount;
            System.out.println(amount+" is deposited. The available balance is "+this.balance);
        }
        else{
            System.out.println(amount+" negative values are not added to account");
        }
    }
    public void withdraw(int amount)
    {
        if(amount>0)
        {
            int withdraw= -amount;
            transactions.add(withdraw);
            this.balance+=withdraw;
            System.out.println(amount+" is withdraw. The available balance is "+this.balance);
        }
        else
        {
          System.out.println(amount+" negative values are not withdraw from account");  
        }
    }
    public void calculateBalance()
    {
        int balance=0;
        for(int i:transactions)
        {
            balance+=i;
        }
        System.out.println("The available is :"+balance);
    }
    
}

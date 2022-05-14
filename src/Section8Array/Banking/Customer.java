
package Section8Array.Banking;

import java.util.*;

public class Customer {
  private String name;
  private ArrayList<Double> transactions;
  public Customer(String name,double initialTranaction)
  {
      this.name=name;
      this.transactions=new ArrayList<Double>();
      addTransaction(initialTranaction);
  }
  public String getName()
  {
      return this.name;
  }
  public ArrayList getTransactions()
  {
      return this.transactions;
  }
  public void addTransaction(double transaction)
  {
      transactions.add(transaction);
  }  
}

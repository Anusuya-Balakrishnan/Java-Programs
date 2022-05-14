
package Section8Array.Banking;

public class Main {
    public static void main(String[] args) {
      Bank bank=new Bank("National Australia Bank");
      bank.addBranch("Adelaide");
      bank.addCustomer("Adelaide","Tim",100.00);
      bank.addCustomer("Adelaide","Mike",200.10);
      bank.addCustomer("Adelaide","Percy",500.00);
      
      bank.addCustomerTransaction("Adelaide","Tim",1000.00);
      bank.addCustomerTransaction("Adelaide","Mike",2000.00);
      bank.addCustomerTransaction("Adelaide","Percy",5000.56);
      
      bank.listCustomers("Adelaide", true);
      bank.addBranch("Sydney");
      bank.addCustomer("Sydney","John", 200.25);
      bank.addCustomer("Sydney","Jancy", 600.25);
      bank.addCustomer("Sydney","Jack", 500.25);
      bank.addCustomer("Sydney","Jo", 1000.25);
      bank.addCustomerTransaction("Sydney", "John",2600.55);
      bank.addCustomerTransaction("Sydney", "Jancy",4000);
      bank.addCustomerTransaction("Sydney", "Jack",600);
      bank.addCustomerTransaction("Sydney", "Jo",8000);
      bank.addCustomerTransaction("Sydney", "John",10000);
      bank.listCustomers("Sydney", false);
      bank.listCustomers("Sydney", true);
      
    
    }
   
   
}

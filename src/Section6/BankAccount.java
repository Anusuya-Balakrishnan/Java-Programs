package Section6;
public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public void setaccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public int getaccountNumber()
    {
        return this.accountNumber;
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public double getbalance()
    {
        return this.balance;
    }
    public void setcustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public String getcustomerName()
    {
        return this.customerName;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public String getemail()
    {
        return this.email;
    }
    public void setphoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public String
         getphoneNumber()
    {
        return this.phoneNumber;
    }
}

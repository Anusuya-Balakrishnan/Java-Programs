package Section5;
public class ForStatementInterestCalculate {
  public static void interestCalculator(double amount,double interestRate)
  {
      System.out.println("10000 at "+interestRate+"% Interest= "+ String.format("%.2f",(amount*(interestRate/100))));
  }
  public static void main(String[] args){
      for(int i=2;i<10;i++)
      {
          interestCalculator(10000.0,i);
      }
      System.out.println("**************");
      for(int i=8;i>1;i--)
      {
          interestCalculator(10000.0,i);
      }
  }
}

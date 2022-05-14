/*

 */
package Section11_NamingConventions.FinalKeyword;

public class Password {
    public static final int key=7843342;
    public final int encryptedPassword;
    public Password(int password)
    {
        encryptedPassword =encrypDecrypt(password);
    }
    public int encrypDecrypt(int password)
    {
        return password^key;
    }
    public final void storePassword()
    {
        System.out.println("Saved password"+this.encryptedPassword);
    }
    public boolean letMeIn(int password){
        if(encrypDecrypt(password)==encryptedPassword)
        {
            System.out.println("Weclome");
            return true;
        }
        else{
            System.out.println("Incorrect Password");
            return false;
        }
    }
}

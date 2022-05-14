/*
 25.1.2022
 */
package Section11_NamingConventions.StaticKeyword;
public class StaticTest {
public static int numInstance=0;
public String name;
public StaticTest(String name)
{
    this.name=name;
    numInstance++;
    System.out.println("Constructor is called");
}
public int getNumInstance()
{
    return this.numInstance;
}
public String getName()
{
    return this.name;
}
}

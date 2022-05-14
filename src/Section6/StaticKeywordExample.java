
package Section6;
class Emp
{
    String name;
    int id;
    int salary;
    static String ceo;
    public Emp(String name,int id,int salary)
    {
        System.out.println("Constructor called");
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    static {
        System.out.println("Static called");
        ceo="AAAA";
    }
    @Override
    public String toString()
    {
        return "["+this.name+" : "+this.id+" :"+this.salary+" :"+ceo+"]";
    }
}
public class StaticKeywordExample {
    public static void main(String[] args) {
       Emp emp1=new Emp("Employee1",100,3000); 
       Emp emp2=new Emp("Employee2",101,4000);
       System.out.println(emp1);
        System.out.println(emp2);
       Emp.ceo="BBB";
        System.out.println(emp1);
        System.out.println(emp2);
    }

}

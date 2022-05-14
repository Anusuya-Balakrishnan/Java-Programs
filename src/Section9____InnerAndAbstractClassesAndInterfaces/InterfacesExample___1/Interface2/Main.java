
package Section9____InnerAndAbstractClassesAndInterfaces.InterfacesExample___1.Interface2;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
//        Player values=new Player("abi",90, 90);
//        System.out.println(values);
//        saveObject(values);
//        values.setHitPoints(8);
//        System.out.println(values);
//        values.setWeapon("Stormbringer");
//        saveObject(values);
//        loadObject(values);
//        System.out.println(values);
        ISavable interfaceValue=new Player("siva",95, 100);
        ((Player) interfaceValue).setWeapon("Sword");
        saveObject(interfaceValue);
        System.out.println(interfaceValue);
//        System.out.println("----------------------------");
//        Monster monster=new Monster("aaaa",300,50);
//        System.out.println(monster);
    }
    public static ArrayList<String> readValues()
    {
        ArrayList<String> values=new ArrayList<String>();
        boolean quit=false;
        int index=0;
        System.out.println("Choose: \n 1.Quit \n 2.Enter string ");
        while(!quit)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your choose: ");
            int choose=scanner.nextInt();
            switch(choose)
            {
                case 1:
                    quit=true;
                    break;
                case 2:
                    System.out.println("enter string: ");
                    String data=scanner.next();
                    values.add(index,data);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISavable objectToSave)
    {
        for(int i=0;i<objectToSave.write().size();i++)
        {
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
        }
    }
    public static void loadObject(ISavable objectToLoad)
    {
        ArrayList<String> values=readValues();
        objectToLoad.read(values);
    }
}

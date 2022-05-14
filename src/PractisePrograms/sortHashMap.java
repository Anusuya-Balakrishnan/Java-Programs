    
package PractisePrograms;
import java.util.*;

public class sortHashMap {
   //program to sort HashMap by keys
   //You can sort HashMap by keys using TreeMap object.
    public static void main(String[] args) {
        Map<Object,Object> map1=new HashMap<>();
        map1.put("a",1 );
        map1.put("h",3 );
        map1.put("e",9 );
        map1.put("b",8 );
        map1.put("c",2 );
        map1=new TreeMap<>(map1);
        System.out.println(map1);
        NavigableSet<Integer>setValue=new TreeSet<Integer>();
        setValue.add(23);
        setValue.add(98);
        setValue.add(-23);
        setValue.add(45);
        setValue.add(78);
        setValue.add(43);
        setValue.add(1258);
        setValue.add(357);
        setValue.add(10);
        System.out.println("Before the descending order"+setValue);
        NavigableSet<Integer> descendingorer=setValue.descendingSet();
        System.out.println("After the descending order"+descendingorer);
        System.out.println("");
        
        }
    }

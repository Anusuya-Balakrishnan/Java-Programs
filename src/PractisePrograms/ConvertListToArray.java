package PractisePrograms;

import java.util.*;

public class ConvertListToArray {

    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("aaa");
        arraylist.add("bbb");
        arraylist.add("ccc");
        arraylist.add("ddd");
        arraylist.add("eee");
        arraylist.add("fff");
        arraylist.add("ggg");
        arraylist.add("hhh");
        String[] arry = new String[arraylist.size()];
        arry = arraylist.toArray(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        //Array can be converted to list using Arrays.asList() method.

        List<String> list1 = Arrays.asList(arry);
        System.out.println(list1);
    }

}

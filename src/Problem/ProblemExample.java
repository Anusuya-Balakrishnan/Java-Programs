package Problem;

import java.util.*;

public class ProblemExample {

    public static Scanner scanner = new Scanner(System.in);
    public static int count;

    public static void main(String[] args) {
        System.out.println("Enter no of values: ");
        int keyValue = scanner.nextInt();
        Map<Object, Object> mapValue = new HashMap<>();
        Map<Object, Object> mapResult = new HashMap<>();
        for (int i = 0; i < keyValue; i++) {
            System.out.println("Enter values: ");
            int value1 = scanner.nextInt();
            mapValue.put(i, value1);
        }
        System.out.println(mapValue);
        for (int i = 0; i < keyValue; i++) {
            count = 1;
            for (int j = i + 1; j < keyValue; j++) {
                if (mapValue.get(i).equals(mapValue.get(j))) {
                    count++;
                    System.out.println(mapValue.get(i)+" repeated "+count + " times");
                    //mapResult.put(mapValue.get(i), count);
                }
            }
        }
//        //System.out.println(mapResult);
//        Set setkey=mapResult.keySet();
//        //System.out.println(setkey);
//        for(Object value: setkey){
//            System.out.println(value+" repeated "+mapResult.get(value)+ " times");
//        }
    }

}

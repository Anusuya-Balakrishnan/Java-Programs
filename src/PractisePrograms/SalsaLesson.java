
package PractisePrograms;

public class SalsaLesson {
    public static void main(String[] args) {
        String A="11100110";
        String B="11100011";
        int count=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B.charAt(i)){
                continue;
            }else{
            count++;
        }
        }
        System.out.println(count);
    }
  
}

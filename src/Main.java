
public class Main {

    public static void main(String[] args) {

        LinkedListExample<String> ob = new LinkedListExample<>();
        ob.linkedlist.add("Hello");
        ob.linkedlist.add("World");
        ob.linkedlist.add("Java");
        ob.linkedlist.add("Collection");
        ob.linkedlist.add("LinkedList");
//       for(int i=0;i<ob.linkedlist.size();i++){
//        System.out.println(ob.linkedlist.getFirst());   
//       }
        System.out.println(ob.linkedlist.get(0));
    }
}

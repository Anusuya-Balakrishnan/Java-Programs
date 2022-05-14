
import java.util.*;

public class LinkedListExample<T> {

    ArrayList<T> linkedlist;

    public void LinkedListExample() {
        linkedlist = new ArrayList<>();
    }

    public void display() {
        for (int i = 0; i < linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i));
        }
    }
}

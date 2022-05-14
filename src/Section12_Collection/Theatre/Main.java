
package Section12_Collection.Theatre;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("Murga Theatre",10,15);
 //       System.out.println(theatre.getTheatreName());
//        theatre.getSeats();
//        if(theatre.reserveSeat("B11"))
//        {
//            System.out.println("Please Pay");
//        }
//        else
//        {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("K11"))
//        {
//            System.out.println("Please Pay");
//        }
//        else
//        {
//            System.out.println("Sorry, seat is taken");
//        }
          List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.seats);
          System.out.println("Original list");
          printList(theatre.seats);
          System.out.println("\n Copy list");
          printList(seatCopy);
          // list reverse
          Collections.reverse(seatCopy);
          System.out.println("\n After Reverse");
          printList(seatCopy);
          List<Theatre.Seat> seatCopy1=new ArrayList<>(theatre.seats);
          System.out.println("\n After Shuffle");
          Collections.shuffle(seatCopy1);
         printList(seatCopy1);
         System.out.println("\n Swapping the seatCopy1");
         sortedOrder(seatCopy1);
         printList(seatCopy1);
    }
    public static void printList(List<Theatre.Seat> list)
    {
        for(Theatre.Seat seat:list)
        {
            System.out.print(" "+seat.getSeatNumber());
        }
    }
    public static void sortedOrder(List<? extends Theatre.Seat> list){
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=i+1;j<list.size()-1;j++){
                if(list.get(i).getSeatNumber().compareTo(list.get(j).getSeatNumber())>0){
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}

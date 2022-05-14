/*
26.1.2022
 */
package Section12_Collection.Theatre;
import java.util.*;
public class Theatre {
    private final String theatreName;
    public List<Seat> seats=new ArrayList<>();
    
    
    public Theatre(String theatreName,int numRows,int seatsPerRow){
        this.theatreName=theatreName;
        
        for(char row='A';row<=(numRows+64);row++){
            
            for(int rowPerSeat=1;rowPerSeat<=seatsPerRow;rowPerSeat++){
                
                String seatValue=row+String.format("%02d",rowPerSeat);
                Seat seat=new Seat(seatValue);
                seats.add(seat);
            }
        }
        
    }
    public String getTheatreName()
        {
            return this.theatreName;
        }
    // binary search using collections:
    public  boolean reserveSeat(String seatNumber)
    {
        Seat requestSeat=new Seat(seatNumber);
        int index=Collections.binarySearch(seats,requestSeat,null);
        if(index>=0)
        {
            return seats.get(index).reverse();
        }
        return false;
    }
    // basic logic of binary search:
//    public boolean reserveSeat(String seatNumber)
//    {
//        int low=0;
//        int high=seats.size()-1;
//        
//        while(low<=high){
//            
//        int mid=(low+high)/2;
//        Seat seatTest=seats.get(mid);
//        int index=seatTest.getSeatNumber().compareTo(seatNumber);
//        if(index<0)
//        {
//            low=mid+1;
//        }
//        else if(index>0){
//            high=mid-1;
//        }else{
//            return seatTest.reverse();
//        }    
//        }
//        
//        return false;
//    }
//    
 // normal comparaison operation:   
//    public boolean reserveSeat(String seatNumber)
//    {
//        Seat requestSeat=null;
//        for(Seat seat:seats){
//            if(seat.getSeatNumber().equals(seatNumber))
//            {
//               // System.out.println("Seat Reserved");
//                requestSeat=seat;
//                break;
//            }        
//        }
//        if(requestSeat==null)
//        {
//            System.out.println("There is no seat"+seatNumber);
//        }
//        return requestSeat.reverse();
//    }

    public void getSeats()
    {
        for(Seat seat:seats)
        {
            System.out.println(seat.getSeatNumber());
        }
    }
    //Inner Class    
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reversed=false;
        public Seat(String seatNumber)
        {
            this.seatNumber=seatNumber;
        }
        public boolean reverse()
        {
            if(!this.reversed)
            {
                this.reversed=true;
                System.out.println("Seat "+this.seatNumber+" reversed");
                return true;
            }
            else{
                return false;
            }
        }
        public boolean cancel()
        {
            if(this.reversed){
                this.reversed=false;
                System.out.println("Reservation for seat "+this.seatNumber+" Cancelled");
                return true;
            }
            else{
                return false;
            }
        }
        public String getSeatNumber()
        {
            return this.seatNumber;
        }
        @Override
        public int compareTo(Seat seat)
        {
            int index=this.getSeatNumber().compareToIgnoreCase(seat.getSeatNumber());
            return index;
        }
    }
    
    
 
    
}

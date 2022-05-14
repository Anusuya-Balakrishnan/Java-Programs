
package Section__10.Generics;

public class LeagueMain {
    public static void main(String[] args) {
        League<Team<FootBallPlayer>> footleague=new League<>("IPL");
        Team<FootBallPlayer> adelaideCrows=new Team<>("Adelaide Crows");
        Team<FootBallPlayer> melbourne=new Team<>("Melbourne");
        Team<FootBallPlayer> hawthorn=new Team<>("Hawthorn"); 
        Team<FootBallPlayer> fremantle=new Team<>("Fremantle");
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);
        
        footleague.add(adelaideCrows);
        footleague.add(melbourne);
        footleague.add(hawthorn);
        footleague.add(fremantle);
        footleague.showLeague();
        
    }
   
}

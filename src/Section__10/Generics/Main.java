
package Section__10.Generics;

public class Main {
    public static void main(String[] args) {
        FootBallPlayer foot=new FootBallPlayer("Dhoni");
        Team<FootBallPlayer> footteam1=new Team<>("Chennai FootBall Team");
        footteam1.addPlayer(new FootBallPlayer("Kohli"));
        footteam1.addPlayer(new FootBallPlayer("Balaji"));
        footteam1.addPlayer(new FootBallPlayer("Sachin"));
        footteam1.addPlayer(new FootBallPlayer("Buvaneshwar"));
        footteam1.addPlayer(new FootBallPlayer("Bumbra"));
        footteam1.addPlayer(new FootBallPlayer("Jedaja"));
        Team<FootBallPlayer> footteam2=new Team<>("Mumbai FootBall Team");
        footteam2.addPlayer(new FootBallPlayer("VS Laxman"));
        footteam2.addPlayer(new FootBallPlayer("Malinga"));
        footteam2.addPlayer(new FootBallPlayer("Dravid"));
        footteam2.addPlayer(new FootBallPlayer("Yuvaraj"));
        footteam2.addPlayer(new FootBallPlayer("Walson"));
        footteam2.addPlayer(new FootBallPlayer("AB de Villiers"));
        footteam1.matchResult(footteam2, 5, 4);
        System.out.println("Ranking: ");
        System.out.println(footteam1.getTeam()+" : "+footteam1.ranking());
        System.out.println(footteam2.getTeam()+" : "+footteam2.ranking());
        System.out.println(footteam1.compareTo(footteam2));
        
    }
  
}

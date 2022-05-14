
package Section__10.Generics;
import java.util.*;
public class Team <T extends Player> implements Comparable<Team <T>> {
    private String name;
    int played=0;
    int win=0;
    int lost=0;
    int tied=0;
    private ArrayList<Player> members=new ArrayList<>();
    public Team(String name)
    {
        this.name=name;
    }
    public String getTeam()
    {
        return this.name;
    }
    //public boolean addPlayer(T player)
    public boolean addPlayer(T player )
    {
        if(members.contains(player))
        {
            //System.out.println(((Player) player).getName()+" already on this team "+this.name);
            System.out.println(player.getName()+" already on this team "+this.name);
            return false;
        }
        else
        {
            members.add(player);
            //System.out.println(((Player)player).getName()+" picked for team "+this.name);
            System.out.println(player.getName()+" picked for team "+this.name);
            return true;
        }
    }
    public int numPlayer()
    {
        return members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int theirScore)
    {
        if(ourScore>theirScore)
        {
            win++;
            System.out.println(this.getTeam()+" win the match");
        }
        else if(theirScore>ourScore)
        {
            lost++;
            System.out.println(this.getTeam()+" lost");
        }
        else if(ourScore==theirScore)
        {
            tied++;
            System.out.println("Match between "+this.getTeam()+" and "+ opponent.getTeam()+" drew");
        }
        played++;
        if(opponent!=null)
        {
            opponent.matchResult(null,theirScore, ourScore);
        }
    }
    public int ranking()
    {
        return (2*win)+tied;
    }
public int compareTo(Team team)
{
    if(this.ranking()>team.ranking())
    {
        return 1;
    }
    else if(this.ranking()<team.ranking())
    {
        return -1;
    }else
    {
        return 0;
    }
}
}

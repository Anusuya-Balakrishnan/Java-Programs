/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section3;

/**
 *
 * @author DELL 1
 */
public class DisplayHighScorePosition {
    public static void main(String[] args){
        int a=calculateHighScorePosition(1500);
        displayHighScorePosition("aaaa", a);
        a=calculateHighScorePosition(700);
        displayHighScorePosition("bbbb", a);
        a=calculateHighScorePosition(400);
        displayHighScorePosition("cccc", a);
        a=calculateHighScorePosition(80);
        displayHighScorePosition("dddd", a);
        
    }
    public static void displayHighScorePosition(String name1,int position1){
        System.out.println(name1 + " managed to get into position " + position1 + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>1000){
            return 1;
        }
        else if(playerScore>500 && playerScore<1000)
        {
            return 2;
        }
        else if(playerScore>100 && playerScore<500)
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }
}

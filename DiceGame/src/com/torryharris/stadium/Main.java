package com.torryharris.stadium;
import com.torryharris.playerpack.Player;

public class Main {

    public static void main(String[] args) {

        Player p1=new Player();
        int p1Score = p1.play();
        int p1d1Score = p1.getD1Score();
        int p1d2Score = p1.getD2Score();
        System.out.println("P1 Scored : "+p1Score);
        System.out.println("P1 D1 : "+p1d1Score+" P1 D2 : "+p1d2Score);

        Player p2=new Player();
        int p2Score = p2.play();
        int p2d1Score = p2.getD1Score();
        int p2d2Score = p2.getD2Score();
        System.out.println("P2 Scored : "+p2Score);
        System.out.println("P2 D1 : "+p2d1Score+" P1 D2 : "+p2d2Score);

        if (p1Score>p2Score){
            System.out.println("P1 won the game!!!");
        }
        else{
            if (p2Score>p1Score){
                System.out.println("P2 won the game!!!");
            }
            else
                System.out.println("It's a draw");
        }
    }
}

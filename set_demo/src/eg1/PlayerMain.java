package eg1;

import java.util.HashSet;
import java.util.Set;

public class PlayerMain {
    public static void main(String[] args) {
        Set<Player> players=new HashSet<>();
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(100,"player1"));
        players.add(new Player(101,"player1"));

        System.out.println("Printing players");
        for(Player p:players){
            System.out.println(p);
        }

    }
}

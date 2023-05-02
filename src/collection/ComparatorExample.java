package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player {

    public String name;
    public Player(String name){
        this.name=name;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        Player p1 = new Player("Venkat");
        Player p2 = new Player("Alekhya");
        Player p3 = new Player("Zeelan");
        Player p4 = new Player("Ssssss");

        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        Collections.sort(players, Comparator.comparing(o -> o.name));

        for (Player player:players){
            System.out.println(player.name);
        }
    }
}

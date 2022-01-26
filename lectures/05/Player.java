import java.util.Arrays; 

public class Player implements Comparable<Player> {
    public int compareTo(Player another) {
        if (this.points  > 21 && another.points  > 21) return this.points - another.points;
        if (this.points <= 21 && another.points <= 21) return -(this.points - another.points);
        if (this.points <= 21 && another.points  > 21) return -1;
        else // if (this.points  > 21 && another.points <= 21) 
          return 1;
        
    }
    String name;
    int points;
    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }
    public String toString() {
        return this.name + ":" + this.points;
    }
    public static void main(String[] args) {
        Player[] players = new Player[5];
        players[0] = new Player("Suraj", 13); 
        players[1] = new Player("Spence", 32); 
        players[2] = new Player("Garrett", 19); 
        players[3] = new Player("Elliot", 21); 
        players[4] = new Player("Jane", 25); 
        System.out.println(Arrays.toString(players));
        Arrays.sort(players); 
        System.out.println(Arrays.toString(players));
    }
}
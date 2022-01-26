import java.util.Arrays; 

public class Player implements Comparable<Player> {
    public int compareTo(Player another) {
      // n1 <= n2 iff n2 % n1 == 0 (n1 factor of n2) 
      if (this.points % another.points == 0) return 1;
      if (another.points % this.points == 0) return -1; 
      else { 
          System.out.println("Can't compare " + this + " with " + another);
          // System.exit(0); 
          return 0; // but how could we throw in fact an exception
      }
    }
    String name;
    int points; // > 0 
    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }
    public String toString() {
        return this.name + ":" + this.points;
    }
    public static void main(String[] args) {
        Player[] players = new Player[5];
        players[0] = new Player("Suraj", 128); 
        players[1] = new Player("Spence", 9); 
        players[2] = new Player("Garrett", 16); 
        players[3] = new Player("Elliot", 3); 
        players[4] = new Player("Jane", 8); 
        System.out.println(Arrays.toString(players));
        try { 
            Arrays.sort(players); 
            System.out.println(Arrays.toString(players));
        } catch (Exception e) {
            System.out.println("This ordering is partial.");    
        }
    }
}
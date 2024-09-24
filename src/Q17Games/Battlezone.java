package Q17Games;

public class Battlezone {
    public static void main(String[] args) {
        Player Harry_Potter = new Player("Harry_Potter", 100, 50, 8);
        Enemy Lord_Voldemort = new Enemy("Lord_Voldemort", 140, 20, 3);

        Harry_Potter.attack(Lord_Voldemort);
        Harry_Potter.attack(Lord_Voldemort);
    }
}

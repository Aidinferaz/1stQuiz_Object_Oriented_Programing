package Q17Games;

public class Enemy {
    private String name;
    private int health;
    private int power;
    private int defense;

    public Enemy(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return power;
    }

    public int getDefense() {
        return defense;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public void setPower(int newPower) {
        this.power = newPower;
    }

    public void setDefense(int newDefense) {
        this.defense = newDefense;
    }

    public void attack(Player player) {
        System.out.println("The enemy attack you with " + this.power + " damage!");
        player.takeDamage(this.power);
    }

    public void takeDamage(int playerPower) {
        int damage = playerPower - this.defense;
        this.health -= damage;
        System.out.println("The enemy been hit! for " + damage + "\n" + "The enemy's health is now " + this.health);

        if (this.health <= 0) {
            System.out.println(name + " died!");
        }
    }
}

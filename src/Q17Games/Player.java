package Q17Games;

public class Player {
    private String name;
    private int health;
    private int power;
    private int defense;

    public Player(String name, int health, int power, int defense) {
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

    public int getPower() {
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

    public void attack(Enemy enemy) {
        System.out.println("You attack the enemy with " + this.power + " damage!");
        enemy.takeDamage(this.power);
    }

    public void takeDamage(int enemyPower) {
        int damage = enemyPower - this.defense;
        this.health -= damage;
        System.out.println("You've been hit! for " + damage + "\n" + "Your health is now " + this.health);

        if (this.health <= 0) {
            System.out.println(name + " died!");
        }
    }

}

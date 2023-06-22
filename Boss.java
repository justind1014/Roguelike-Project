/*
 * This is the class for the boss of the dungeon. The boss blocks the exit out and must be defeated to win.
 * The boss is random and the player finishes the game if they beat the boss.
 */
public class Boss {
    
    //Instance variables
    private String name;
    private int healthPoints;
    private int damage;
    private int goldReward;

    //Constructor
    public Boss(String name, int healthPoints, int damage, int goldReward) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.goldReward = goldReward;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getGoldReward() {
        return this.goldReward;
    }

    //Setters
    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

}

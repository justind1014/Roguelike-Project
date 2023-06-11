/*
 * This class holds the stats for an enemy.
 * If the player comes across one, they will have to enter into a battle with it.
 */
public class Enemy {
    
    //Instance variables
    private String name;
    private int healthPoints;
    private int damage;
    private int goldReward;

    //Constructor
    public Enemy(String name, int healthPoints, int damage, int goldReward) {
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

    public int getGoldReward(){
        return this.goldReward;
    }
    
    //Setters
    public void setHealthPoints(int newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

}

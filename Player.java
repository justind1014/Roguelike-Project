/*
 * This is the Player class. This will be the character the user controls to move through rooms.
 * HP, gold, and the player's held weapon will all be stored here. The player always starts at 5, 5.
 */
public class Player {
    
    //Instance variables
    private int healthPoints;
    private int gold;
    private Weapon heldWeapon;
    private int xPosition;
    private int yPosition;

    //Constructor
    public Player() {
        this.healthPoints = 100;
        this.gold = 0;
        this.xPosition = 7;
        this.yPosition = 7;
        this.heldWeapon = new Weapon("Fists", 2);
    }

    //Getters
    public int getHealthPoints() {
        return this.healthPoints;
    }

    public int getGold() {
        return this.gold;
    }

    public Weapon getHeldWeapon(){
        return this.heldWeapon;
    }

    public int getxPosition() {
        return this.xPosition;
    }

    public int getyPosition() {
        return this.yPosition;
    }

    //Setters
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setHeldWeapon(Weapon newWeapon){
        this.heldWeapon = newWeapon;
    }

    public void moveNorth(){
        this.yPosition = this.yPosition - 1;
    }

    public void moveEast(){
        this.xPosition = this.xPosition + 1;
    }

    public void moveSouth(){
        this.yPosition = this.yPosition + 1;
    }

    public void moveWest(){
        this.xPosition = this.xPosition - 1;
    }
    
}

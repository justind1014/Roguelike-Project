/*
 * This is the Room Class. Rooms will be placed in a grid through the LevelLayout class. 
 * The player will be able to move through these rooms one at a time.
 * This file will be a SuperClass for other specific types of rooms (EnemyRoom, TreasureRoom, etc.).
 */
public class Room {
    
    //Instance variables
    private int xPosition;
    private int yPosition;
    private String type;

    //Constructor
    public Room(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.type = "Empty";
    }

    //Getters
    public int getxPosition() {
        return this.xPosition;
    }

    public int getyPosition() {
        return this.yPosition;
    }

    public String getType(){
        return this.type;
    }

    //Setters
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }


}

/*
 * Sub class to Room. Houses a random amount of gold within a certain range.
 * The player will collect the gold when they pass through the romm.
 */
public class TreasureRoom extends Room{
    
    //Instance variables
    private int goldAmount;
    private String type;

    //Constructor
    public TreasureRoom(int xPosition, int yPosition, int goldAmount) {
        super(xPosition, yPosition);
        this.goldAmount = goldAmount;
        this.type = "Treasure";
    }

    //Getters
    public int getGoldAmount() {
        return goldAmount;
    }

    public String getType() {
        return type;
    }

    //Setters
    public void emptyRoom(){
        this.goldAmount = 0;
    }

}

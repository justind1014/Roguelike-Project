public class BossRoom extends Room{
    
    //Instance variables
    private Boss roomBoss;
    private String type;

    public BossRoom(int xPosition, int yPosition, Boss roomBoss) {
        super(xPosition, yPosition);
        this.roomBoss = roomBoss;
        this.type = "Boss";
    }

    //Getters
    public Boss getRoomBoss() {
        return roomBoss;
    }

    public String getType() {
        return type;
    }

    //Setters
    public void emptyRoom() {
        this.roomBoss = null;
    }

}

/*
 * Sub class to Room. This room will contain a random enemy. 
 * If the player enters this room, they have to fight the enemy.
 * If they lose, they restart. If they win, they get gold and move on.
 */
public class EnemyRoom extends Room{
    
    //Instance variables
    private Enemy roomEnemy;
    private String type;

    //Constructor
    public EnemyRoom(int xPosition, int yPosition, Enemy roomEnemy) {
        super(xPosition, yPosition);
        this.roomEnemy = roomEnemy;
        this.type = "Enemy";
    }

    //Getters
    public Enemy getRoomEnemy() {
        return roomEnemy;
    }

    public String getType() {
        return this.type;
    }

    //Setters
    public void emptyRoom(){
        this.roomEnemy = null;
    }

}

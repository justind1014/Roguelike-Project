/*
 * Sub class to Room. Will contain a random weapon for the player.
 * When coming across this room, the player will be given an option to pick it up or leave it.
 */
public class WeaponRoom extends Room{
    
    //Instance variables
    private Weapon roomWeapon;
    private String type;

    //Constructor
    public WeaponRoom(int xPosition, int yPosition, Weapon roomWeapon) {
        super(xPosition, yPosition);
        this.roomWeapon = roomWeapon;
        this.type = "Weapon";
    }

    //Getters
    public Weapon getRoomWeapon() {
        return this.roomWeapon;
    }
    
    public String getType(){
        return this.type;
    }

    //Setters
    public void emptyRoom(){
        this.roomWeapon = null;
    }

}

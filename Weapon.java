/*
 * This class contains all of the stats and methods for a weapon.
 */
public class Weapon {
    //Instance variables
    private String name;
    private int damage;

    //Constructors
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

}

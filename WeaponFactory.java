import java.util.Random;

public class WeaponFactory {
    
    public static Weapon randomWeapon(){
        Random rand = new Random();
        int weaponType = rand.nextInt(5) + 1;
        Weapon randWeapon = null;
        if(weaponType == 1){
            Weapon club = new Weapon("Club", 3);
            randWeapon = club;
        }else if(weaponType == 2){
            Weapon knife = new Weapon("Knife", 5);
            randWeapon = knife;
        }else if(weaponType == 3){
            Weapon spear = new Weapon("Spear", 10);
            randWeapon = spear;
        }else if(weaponType == 4){
            Weapon shortSword = new Weapon("Shortsword", 15);
            randWeapon = shortSword;
        }else if(weaponType == 5){
            Weapon longSword = new Weapon("Longsword", 20);
            randWeapon = longSword;
        }
        return randWeapon;
    }
}
